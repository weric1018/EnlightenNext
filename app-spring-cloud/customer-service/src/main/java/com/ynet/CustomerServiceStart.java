package com.ynet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by yuanxu on 2018/7/24.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc
@EnableFeignClients
public class CustomerServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceStart.class, args);
    }
}
