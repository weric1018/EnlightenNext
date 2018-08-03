package com.ynet.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by yuanxu on 2018/7/25.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerStart {

    public static void main(String[] args){
        new SpringApplicationBuilder(ConfigServerStart.class).web(true).run(args);
    }
}
