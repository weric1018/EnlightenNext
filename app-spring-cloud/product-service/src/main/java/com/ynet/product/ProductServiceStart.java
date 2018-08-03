package com.ynet.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by yuanxu on 2018/7/24.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc
public class ProductServiceStart {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceStart.class, args);
    }
}
