package com.ls.shares.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Desciption
 * @Author hp
 * @Date 2019/1/917:59
 **/

//@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {


    @Bean
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       /* registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");*/
    }
}