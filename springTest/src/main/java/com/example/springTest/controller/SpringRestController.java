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
// import com.example.kinpy.dto.*;
import com.peechan.enums.Message;

import com.example.springTest.dto.RestMessage;
import com.example.springTest.mapper.ArticlesMapper;
import com.example.springTest.mapper.ArticlesMapperExtends;
import com.example.springTest.mapper.CommentsMapper;
import com.example.springTest.mapper.CommentsMapperExtends;
import com.example.springTest.model.Articles;
import com.example.springTest.service.SpringService1;
import com.example.springTest.service.SpringService2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

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
    SpringService1 springService1;

    @Autowired
    SpringService2 springService2;

    @Autowired
    @Qualifier("bean1")
    long numOfArticles;

    @Value("${dirpath.list}")
    String dirPath;

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("application");

    private static ResourceBundle msgBundle = ResourceBundle.getBundle("message");

    @PostMapping(value = "/aaa")
    // public String searchArticles(@RequestBody @Validated Message message) {
    // application/jsonとしてパラメーターを受け取る場合は、DTO に@RequestBodyを付与
    public long aaa(@Validated @RequestBody RestMessage message) {

        System.out.println(numOfArticles);

        System.out.println(msgBundle.getString("test"));

        long startTime = System.currentTimeMillis();
        
        logger.info("access POST /aaa");
        
        List<Articles> resultList = new ArrayList<Articles>();

        try{
            resultList = springService1.getArticles("あ", true);
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
        System.out.println(resourceBundle.getString("dirpath.list"));

        sample0();

        List<Articles> resultList = new ArrayList<Articles>();

        try{
            resultList = springService1.getArticles("あ", true);
            System.out.println(resultList.size());
            resultList = springService1.getArticles2("あ", true);
        }catch(Exception e){
            // return "error";
        }

        System.out.println(Message.MSG_001.getCode());

        long endTime = System.currentTimeMillis();
        logger.info("bbb 件数：{}", resultList.size());
        logger.info("bbb 処理時間：" + (endTime - startTime) + "ms");

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/sample")
    // public ResponseEntity<Void> sample(@RequestBody Message message) {
    public ResponseEntity<Void> sample(@RequestBody String message) throws Exception {        

        ObjectMapper objectMapper = new ObjectMapper();

        String jsonAsString;
        try {
            jsonAsString = objectMapper.writeValueAsString(message);                    
            System.out.println(jsonAsString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
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

    public int sample0(){
        System.out.println("sample0 モックではない");
        return 0;
    }

    @PostMapping(value = "/validate")
    public ResponseEntity<Void> validate() {        

        // int result = springService2.validate();
        // System.out.println("結果は" + result);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
