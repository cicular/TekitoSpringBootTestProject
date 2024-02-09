package com.example.springTest;

import java.util.List;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.web.client.RestTemplate;

import com.example.mapper.ArticlesMapper;
import com.example.model.Articles;
import com.example.model.ArticlesExample;

@Configuration
// mybatis-spring-boot-starterを使ってMyBatisを利用する場合、
// アプリケーション起動時に@Mapperが付与されているインターフェースが自動的にスキャンされ、Mapperとして登録される。
// しかしマッパーが他モジュール（jar）内の場合はスキャンされないため、@MapperScanが必要。
@MapperScan("com.example.mapper")
@MapperScan("com.example.kinpy.mapper")
public class AppConfig {

    @Autowired
    ArticlesMapper articlesMapper;

    @Bean
    public RestTemplate configMethod000(){
        return new RestTemplate();
    }
    
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

    // @Bean
	// public DataSource dataSource() {
    //     System.out.println("dataSource");
	// 	return new TransactionAwareDataSourceProxy(
	// 		DataSourceBuilder
	// 		.create()
	// 		.username("postgres")
	// 		.password("postgres")
	// 		.url("jdbc:postgresql://localhost:5432/postgres")
	// 		.driverClassName("org.postgresql.Driver")
	// 		.build());
	// }
}
