package com.stcc.gateway.handler;

import com.stcc.common.core.utils.ServletUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.reactive.error.ErrorWebExceptionHandler;
import org.springframework.cloud.gateway.support.NotFoundException;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 包名 com.stcc.gateway.handler
 * 说明 网关统一异常处理
 * 创建时间 2021/10/9
 * @author stcc
 */

public class GatewayExceptionHandler implements ErrorWebExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GatewayExceptionHandler.class);
    @Override
    public Mono<Void> handle(ServerWebExchange serverWebExchange, Throwable throwable) {
        {
            ServerHttpResponse response = serverWebExchange.getResponse();

            if (serverWebExchange.getResponse().isCommitted())
            {
                return Mono.error(throwable);
            }

            String msg;

            if (throwable instanceof NotFoundException)
            {
                msg = "服务未找到";
            }
            else if (throwable instanceof ResponseStatusException)
            {
                ResponseStatusException responseStatusException = (ResponseStatusException) throwable;
                msg = responseStatusException.getMessage();
            }
            else
            {
                msg = "内部服务器错误";
            }

            log.error("[网关异常处理]请求路径:{},异常信息:{}", serverWebExchange.getRequest().getPath(), throwable.getMessage());

            return ServletUtils.webFluxResponseWriter(response, msg);
        }
    }
}
