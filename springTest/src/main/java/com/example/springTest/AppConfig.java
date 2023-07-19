package com.example.springTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.example.springTest.mapper.ArticlesMapper;
import com.example.springTest.model.Articles;
import com.example.springTest.model.ArticlesExample;

@Configuration
public class AppConfig {

    @Autowired
    ArticlesMapper articlesMapper;
    
    @Bean
    public long configMethod0(){
        System.out.println("AppConfigのcreate");
        long numOfArticles = articlesMapper.countByExample(new ArticlesExample());
        return numOfArticles;
    }

    @Bean
    public String configMethod00(Environment env){
        System.out.println(env.getProperty("dirpath.list"));
        return env.getProperty("dirpath.list");
    }

    @Bean(name="bean1")
    public long configMethod1(){
        System.out.println("configMethod1");
        return 1L;
    }

    @Bean(name="bean2")
    public long configMethod2(){
        System.out.println("configMethod2");
        return 2L;
    }

    @Bean(name="bean3")
    public long configMethod3(){
        System.out.println("configMethod3");
        return 2L;
    }

    @Bean(name="bean4")
    public long configMethod4(){
        System.out.println("configMethod4");
        return 2L;
    }

    @Bean(name="bean5")
    public long configMethod5(){
        System.out.println("configMethod5");
        return 2L;
    }

}
