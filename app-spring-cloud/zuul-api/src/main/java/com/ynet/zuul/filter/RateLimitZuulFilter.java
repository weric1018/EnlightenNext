package com.ynet.zuul.filter;

import com.alibaba.fastjson.JSON;
import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.ynet.zuul.utils.Result;
import org.apache.log4j.Logger;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by yuanxu on 2018/8/1.
 */
@Component
public class RateLimitZuulFilter extends ZuulFilter {

    //初始化令牌数
    private final RateLimiter rateLimiter = RateLimiter.create(10);
    private final Logger logger = Logger.getLogger(getClass());

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    @Override
    public boolean shouldFilter() {
        // 这里可以考虑弄个限流开启的开关，开启限流返回true，关闭限流返回false，你懂的。
        return true;
    }

    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletResponse response = currentContext.getResponse();
        if (!rateLimiter.tryAcquire()) {
            logger.info("请求超限...");
            /*HttpStatus httpStatus = HttpStatus.TOO_MANY_REQUESTS;
            response.setContentType(MediaType.TEXT_PLAIN_VALUE);
            response.setStatus(httpStatus.value());
            response.getWriter().append(httpStatus.getReasonPhrase());
            currentContext.setSendZuulResponse(false);
            throw new ZuulException(
                    httpStatus.getReasonPhrase(),
                    httpStatus.value(),
                    httpStatus.getReasonPhrase()
            );*/

            currentContext.setSendZuulResponse(false);//不通过
            response.setContentType("text/html;charset=UTF-8");
            currentContext.setResponseBody(JSON.toJSONString(Result.REQUEST_LIMIT));
        }

        return null;
    }
}
