package com.ls.shares.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @Desciption
 * @Author hp
 * @Date 2019/1/916:43
 **/


@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{


    /**
     * 配置拦截器保护请求
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                //不过滤
                .antMatchers("/css/**","/","/index").permitAll()
                    //需要过滤
                .anyRequest().authenticated()
                .and().formLogin()
                    //登录成功/失败跳转
                .loginPage("/login").permitAll()
                .and().logout().permitAll();



    }

    /**
     * 配置user-detail服务
     *
     *
     */
    @Bean
    @Override
    protected UserDetailsService userDetailsService() {

        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        UserDetails build = User.withUsername("user")
                .password(encoder.encode("password"))
                .roles("user").build();

        return new InMemoryUserDetailsManager(build);
    }
}

