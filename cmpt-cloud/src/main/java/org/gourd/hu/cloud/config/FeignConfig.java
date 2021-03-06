package org.gourd.hu.cloud.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.gourd.hu.base.constant.HeaderConstant;
import org.springframework.context.annotation.Configuration;

/**
 * feign拦截配置，设置约定header信息
 * @author gourd
 */
@Configuration
@Slf4j
public class FeignConfig implements RequestInterceptor {


    @Override
    public void apply(RequestTemplate requestTemplate) {
        // header里面添加约定值
        requestTemplate.header(HeaderConstant.HEADER_TOKEN_IGNORE, HeaderConstant.TOKEN_IGNORE_FLAG);
        log.info("header:" + requestTemplate.headers());
    }
}