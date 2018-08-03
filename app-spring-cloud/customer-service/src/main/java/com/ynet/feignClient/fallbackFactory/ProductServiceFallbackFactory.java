package com.ynet.feignClient.fallbackFactory;

import com.ynet.feignClient.ProductServiceClient;
import feign.hystrix.FallbackFactory;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by yuanxu on 2018/7/25.
 */
@Component
public class ProductServiceFallbackFactory implements FallbackFactory<ProductServiceClient> {

    private final Logger logger = Logger.getLogger(getClass());

    @Override
    public ProductServiceClient create(final Throwable cause) {
        logger.info("/query, feign-fallback-cause:" + cause);
        return new ProductServiceClient() {
            @Override
            public Boolean check(@PathVariable("code") String code) {
                logger.info("/query, /check-feign-fallback-cause:" + cause);
                return false;
            }
        };
    }
}
