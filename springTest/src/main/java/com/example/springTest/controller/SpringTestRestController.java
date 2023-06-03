package com.example.springTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springTest.dto.Message;
import com.example.springTest.mapper.ArticlesMapper;
import com.example.springTest.mapper.ArticlesMapperExtends;
import com.example.springTest.mapper.CommentsMapper;
import com.example.springTest.mapper.CommentsMapperExtends;
import com.example.springTest.model.Articles;
import com.example.springTest.service.SpringTestService;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value = "/spring")
public class SpringTestRestController {

    Logger logger = LoggerFactory.getLogger(SpringTestController.class);

    @Autowired
    ArticlesMapper articlesMapper;

    @Autowired
    ArticlesMapperExtends articlesMapperExtends;

    @Autowired
    CommentsMapper commentsMapper;

    @Autowired
    CommentsMapperExtends commentsMapperExtends;

    @Autowired
    SpringTestService springTestService;

    @Autowired
    long numOfArticles;

    @PostMapping(value = "/aaa")
    // public String searchArticles(@RequestBody @Validated Message message) {
    // application/jsonとしてパラメーターを受け取る場合は、DTO に@RequestBodyを付与
    public long aaa(@RequestBody Message message) {

        System.out.println(numOfArticles);

        long startTime = System.currentTimeMillis();
        
        logger.info("access POST /aaa");

        List<Articles> resultList = new ArrayList<Articles>();

        try{
            resultList = springTestService.getArticles("あ", true);
        }catch(Exception e){
            return 0L;
        }

        long endTime = System.currentTimeMillis();
        logger.info("aaa 件数：{}", resultList.size());
        logger.info("aaa 処理時間：" + (endTime - startTime) + "ms");

        return numOfArticles;

    }

    @PostMapping(value = "/bbb")
    // public String searchArticles(@RequestBody @Validated Message message) {
    public String bbb() {

        long startTime = System.currentTimeMillis();
        
        logger.info("access POST /bbb");

        List<Articles> resultList = new ArrayList<Articles>();

        try{
            resultList = springTestService.getArticles("あ", true);
        }catch(Exception e){
            return "error";
        }

        long endTime = System.currentTimeMillis();
        logger.info("bbb 件数：{}", resultList.size());
        logger.info("bbb 処理時間：" + (endTime - startTime) + "ms");

        return "bbb";

    }
}
