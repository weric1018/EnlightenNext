package com.ynet.feignClient;

import com.ynet.feignClient.fallbackFactory.ProductServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yuanxu on 2018/7/25.
 */
@FeignClient(name = "product-service", fallbackFactory = ProductServiceFallbackFactory.class)
public interface ProductServiceClient {

    @RequestMapping(method = RequestMethod.GET , path = "check?code={code}")
    Boolean check(@PathVariable("code") String code);

}
