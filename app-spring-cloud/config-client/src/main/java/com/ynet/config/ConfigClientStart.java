package com.ynet.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by yuanxu on 2018/7/26.
 */
@SpringBootApplication
public class ConfigClientStart {
    public static void main(String[] args){
        new SpringApplicationBuilder(ConfigClientStart.class).web(true).run(args);
    }
}
