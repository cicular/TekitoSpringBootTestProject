package com.example.springTest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springTest.mapper.ArticlesMapper;
import com.example.springTest.mapper.ArticlesMapperExtends;
import com.example.springTest.mapper.CommentsMapper;
import com.example.springTest.model.Articles;
import com.example.springTest.model.ArticlesExample;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.apache.logging.log4j.LogManager; // ★
import org.apache.logging.log4j.Logger;     // ★

@Service
public class SpringService1 {

    @Autowired
    ArticlesMapper articlesMapper;

    @Autowired
    ArticlesMapperExtends articlesMapperExtends;

    @Autowired
    CommentsMapper commentsMapper;

    // Logger logger = LoggerFactory.getLogger(SpringService1.class);
    private static Logger logger = LogManager.getLogger(SpringService1.class);
    
    public List<Articles> getArticles(String searchWordArticle, boolean flg) throws Exception{

        System.out.println("getArticles:モックじゃありません。");
        String[] wordArray = searchWordArticle.split("　");

        List<Articles> articleListTitle = new ArrayList<Articles>();
        List<Articles> articleListContent = new ArrayList<Articles>();

        try{
            var articleExample = new ArticlesExample();
            var criteria = articleExample.createCriteria();

            for(String word : wordArray){
                criteria.andArticleTitleLike("%" + word + "%");
            }

            if (!flg){
                criteria.andRemarksIsNull();
            }
            articleListTitle = articlesMapper.selectByExample(articleExample);
            // System.out.println("articleListTitleのサイズ:" + articleListTitle.size());

            articleExample.clear();
            criteria = articleExample.createCriteria();
            for(String word : wordArray){
                criteria.andArticleContentLike("%" + word + "%");
            }

            if (!flg){
                criteria.andRemarksIsNull();
            }
            articleListContent = articlesMapper.selectByExample(articleExample);
    
        }catch(Exception e){
            e.printStackTrace();
            logger.error("searchArticlesでエラー発生");
            logger.error(e.toString());
            throw(e);
        }

        List<Articles> resultList = Stream.concat(articleListContent.stream(), articleListTitle.stream())
            .distinct()
            .collect(Collectors.toList());

        // result.forEach(System.out::println);

        if (!flg){
            Collections.sort(resultList, Comparator.comparing(Articles::getPostDate));
        }else{
            Collections.sort(resultList, Comparator.comparing(Articles::getPostDate).reversed());
        }

        return resultList;
    }

    public int dummy(int... value){
        int result = 0;
        for (int v : value) {
            result += v;
        }

        return result;
    }

    public int privateDummy(int... value){
        int result = 0;
        for (int v : value) {
            result += v;
        }

        return result;
    }
}
