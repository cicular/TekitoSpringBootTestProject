package com.example.springTest;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        var resolver = new PageableHandlerMethodArgumentResolver();
        // これがあると、pageable.getPageNumber()がどうしても0になってしまう。
        // resolver.setOneIndexedParameters(true);
        // 最大値のデフォルトは20
        resolver.setMaxPageSize(100);
        argumentResolvers.add(resolver);

        System.out.println("config");
    }
}
