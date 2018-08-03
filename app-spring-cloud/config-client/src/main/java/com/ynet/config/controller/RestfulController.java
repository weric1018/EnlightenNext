package com.ynet.config.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuanxu on 2018/7/26.
 */
@RefreshScope
@RestController
public class RestfulController {

    private final Logger logger = Logger.getLogger(getClass());

    @Value("${info}")
    private String info;

    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String test(){
        logger.info("/test, 11111:");
        return this.info;
    }

}
