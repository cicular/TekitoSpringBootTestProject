package com.example.springTest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.springTest.dto.SearchElement;
import com.example.springTest.mapper.ArticlesMapper;
import com.example.springTest.mapper.ArticlesMapperExtends;
import com.example.springTest.mapper.CommentsMapper;
import com.example.springTest.model.Articles;
import com.example.springTest.model.ArticlesExample;
import com.example.springTest.model.ArticlesInfo;
import com.example.springTest.model.CommentsExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;

@Service
public class SpringTestService {

    final int BLOG_START_YEAR = 2005;

    @Autowired
    ArticlesMapper articlesMapper;

    @Autowired
    ArticlesMapperExtends articlesMapperExtends;

    @Autowired
    CommentsMapper commentsMapper;

    Logger logger = LoggerFactory.getLogger(SpringTestService.class);
    
    public List<Articles> getArticles(String searchWordArticle, 
        SearchElement se) throws Exception{
        String[] wordArray = searchWordArticle.split("　");

        List<Articles> articleListTitle = new ArrayList<Articles>();
        List<Articles> articleListContent = new ArrayList<Articles>();

        try{
            // 検索条件
            var articleExample = new ArticlesExample();
            var criteria = articleExample.createCriteria();

            // 記事タイトル
            for(String word : wordArray){
                criteria.andArticleTitleLike("%" + word + "%");
            }

            // 1度のクエリでできないので、2回に分けて実行とする。
            // for(int i=0; i<wordArray.length;i++){
            //     if(i==0){
            //         articleExample.or(
            //             articleExample.createCriteria().andArticleContentLike("%" + wordArray[i] + "%"));    
            //     }else{
            //         articleExample.createCriteria().andArticleContentLike("%" + wordArray[i] + "%");←これがSQLになってくれない...
            //     }
            // }

            if (!se.isOtherSiteFlg()){
                criteria.andRemarksIsNull();
            }
            articleListTitle = articlesMapper.selectByExample(articleExample);
            System.out.println("articleListTitleのサイズ:" + articleListTitle.size());

            articleExample.clear();
            criteria = articleExample.createCriteria();
            for(String word : wordArray){
                criteria.andArticleContentLike("%" + word + "%");
            }

            if (!se.isOtherSiteFlg()){
                criteria.andRemarksIsNull();
            }
            articleListContent = articlesMapper.selectByExample(articleExample);
            System.out.println("articleListContentのサイズ:" + articleListContent.size());
    
        }catch(Exception e){
            e.printStackTrace();
            logger.error("searchArticlesでエラー発生");
            logger.error(e.toString());
            throw(e);
        }

        List<Articles> resultList = Stream.concat(articleListContent.stream(), articleListTitle.stream())
            .distinct()
            // .sorted(Comparator.naturalOrder()) // 昇順でソート
            .collect(Collectors.toList());

        // result.forEach(System.out::println);

        if (!se.isSortFlg()){
            Collections.sort(resultList, Comparator.comparing(Articles::getPostDate));
        }else{
            Collections.sort(resultList, Comparator.comparing(Articles::getPostDate).reversed());
        }

        return resultList;
    }

    public Page<ArticlesInfo> getComments(String searchWordCm, String searchWordCmUser, boolean sortFlg, Pageable pageable) throws Exception{

        List<ArticlesInfo> articleInfoList = new ArrayList<ArticlesInfo>();

        // 検索条件
        var commentsExample = new CommentsExample();
        var criteria = commentsExample.createCriteria();

        if (!StringUtils.isBlank(searchWordCm)){

            String[] wordArray = searchWordCm.split("　");

            for(String word : wordArray){
                criteria.andCommentContentLike("%" + word + "%");
            }
        }

        if (!StringUtils.isBlank(searchWordCmUser)){
            criteria.andUserNameLike("%" + searchWordCmUser + "%");
        }

        if (!sortFlg){
            commentsExample.setOrderByClause("post_date_time");
        }else{
            commentsExample.setOrderByClause("post_date_time desc");
        }

        var rowBounds = new RowBounds((int)pageable.getOffset(), pageable.getPageSize());
        System.out.println((int)pageable.getOffset());
        System.out.println(pageable.getPageSize());

        try{
            articleInfoList = articlesMapperExtends.selectByCommmentWord(commentsExample, rowBounds);
        }catch(Exception e){
            e.printStackTrace();
            logger.error("searchCommentsでエラー発生");
            logger.error(e.toString());
            throw e;
        }

        // 総件数
        long numOfTotal = commentsMapper.countByExample(commentsExample);

        return new PageImpl<>(articleInfoList, pageable, numOfTotal);
        // return articleInfoList;

    }

    public List<Articles> getSameDayArticles() throws Exception{
        
        // 検索条件
        var articleExample = new ArticlesExample();

        Calendar cal = Calendar.getInstance();
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getYear());

        for(int i=1; i<=now.getYear()-BLOG_START_YEAR; i++){
            cal.setTime(new Date());
            cal.add(Calendar.YEAR, -i);
            cal.set(Calendar.HOUR, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);

            articleExample.or(
                articleExample.createCriteria().andPostDateEqualTo(cal.getTime()));
            // System.out.println(cal.getTime());
        }

        // 古い順にテーブルに登録していることが前提
        articleExample.setOrderByClause("article_id desc");
        List<Articles> articleList = new ArrayList<Articles>();

        try{
            articleList = articlesMapper.selectByExample(articleExample);
        }catch(Exception e){
            e.printStackTrace();
            logger.error("getSameDayArticlesでエラー発生");
            logger.error(e.toString());
            throw e;
        }

        return articleList;
        
    }
}
