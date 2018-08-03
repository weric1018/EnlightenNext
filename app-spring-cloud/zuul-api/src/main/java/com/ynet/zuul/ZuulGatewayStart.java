package com.ynet.zuul;


import com.ynet.zuul.filter.AccessFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by yuanxu on 2018/7/24.
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulGatewayStart {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulGatewayStart.class).web(true).run(args);
    }

    /*@Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
*/
}
