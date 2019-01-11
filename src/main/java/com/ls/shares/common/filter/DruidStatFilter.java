package com.ls.shares.common.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @Desciption
 * @Author hp
 * @Date 2018/12/2610:44
 **/
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
        initParams = {
                 @WebInitParam(name = "exclusions",
                        value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*") })
public class DruidStatFilter extends WebStatFilter{

}
