package com.example.springTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value = "/spring")
public class SpringRestController {

    Logger logger = LoggerFactory.getLogger(SpringRestController.class);

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
    // @Qualifier("bean1")
    long numOfArticles;

    @Value("${dirpath.list}")
    String dirPath;

    @PostMapping(value = "/aaa")
    // public String searchArticles(@RequestBody @Validated Message message) {
    // application/jsonとしてパラメーターを受け取る場合は、DTO に@RequestBodyを付与
    public long aaa(@Validated @RequestBody Message message) {

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
    public ResponseEntity<Void> bbb() throws Exception {

        long startTime = System.currentTimeMillis();
        
        logger.info("access POST /bbb");

        List<Articles> resultList = new ArrayList<Articles>();

        try{
            resultList = springTestService.getArticles("あ", true);
        }catch(Exception e){
            // return "error";
        }

        long endTime = System.currentTimeMillis();
        logger.info("bbb 件数：{}", resultList.size());
        logger.info("bbb 処理時間：" + (endTime - startTime) + "ms");

        return new ResponseEntity<>(HttpStatus.OK);
        // return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        // return null;
        // throw(new Exception());

    }

    @PostMapping(value = "/sample")
    // public ResponseEntity<Void> sample(@RequestBody Message message) {
    public ResponseEntity<Void> sample(@RequestBody String message) throws Exception {        
        System.out.println(message);

        // ObjectMapper objectMapper = new ObjectMapper();

        // String jsonAsString;
        // try {
        //     jsonAsString = objectMapper.writeValueAsString(message1);                    
        //     System.out.println(jsonAsString);
        // } catch (JsonProcessingException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        throw new Exception();
        // return null;

        // return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/sample2")
    // public ResponseEntity<Void> sample(@RequestBody Message message) {
    public ResponseEntity<Void> sample2(@RequestBody String message) throws Exception {        
        System.out.println(message);

        // ObjectMapper objectMapper = new ObjectMapper();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/sample3")
    // public ResponseEntity<Void> sample(@RequestBody Message message) {
    public ResponseEntity<Void> sample3(@RequestBody String message) throws Exception {        
        System.out.println(dirPath);

        // ObjectMapper objectMapper = new ObjectMapper();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
