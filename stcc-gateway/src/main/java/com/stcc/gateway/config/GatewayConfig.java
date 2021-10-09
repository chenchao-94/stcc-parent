package com.stcc.gateway.config;

import com.stcc.gateway.handler.GatewayExceptionHandler;
import com.stcc.gateway.handler.SentinelFallbackHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * 包名 com.stcc.gateway.config
 * 说明 阿里sentinel配合gateway 网关限流
 * 创建时间 2021/10/9
 * @author stcc
 */
@Configuration
public class GatewayConfig {

    /**
     * 配置自定义限流异常处理器
     * @return
     */
    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public SentinelFallbackHandler sentinelGatewayExceptionHandler()
    {
        return new SentinelFallbackHandler();
    }

    /**
     * 配置网关异常处理器
     * @return
     */
    @Bean
    @Order(-1)
    public GatewayExceptionHandler gatewayExceptionHandler(){
        return new GatewayExceptionHandler();
    }
}
