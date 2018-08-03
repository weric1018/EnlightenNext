package com.ynet.controller;

import com.netflix.discovery.EurekaClient;
import com.ynet.entity.Apppar;
import com.ynet.feignClient.ProductServiceClient;
import com.ynet.service.AppparService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuanxu on 2018/7/24.
 */
@RestController
public class CustomerController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;
    @Autowired
    private AppparService service;
    @Autowired
    private ProductServiceClient productService;

    @RequestMapping(value = "/query" ,method = RequestMethod.GET)
    public Apppar query(@RequestParam String code) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/query, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        logger.info("/query, code:" + code);
        //Apppar apppar = service.selectByCode(code);
        Boolean bool = productService.check(code);
        logger.info("/query, check result:" + bool);



        return null;
    }
}
