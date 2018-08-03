package com.ynet.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by yuanxu on 2018/7/24.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerStart {

    public static void main(String[] args){
        //SpringApplication.run(EurekaServerStart.class, args);
        new SpringApplicationBuilder(EurekaServerStart.class).web(true).run(args);
    }
}
