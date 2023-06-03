package com.example.springTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springTest.mapper.ArticlesMapper;
import com.example.springTest.model.ArticlesExample;

@Configuration
public class AppConfig {

    @Autowired
    ArticlesMapper articlesMapper;
    
    @Bean
    public long create(){
        System.out.println("AppConfigのcreate");
        long numOfArticles = articlesMapper.countByExample(new ArticlesExample());
        return numOfArticles;
    }
}
