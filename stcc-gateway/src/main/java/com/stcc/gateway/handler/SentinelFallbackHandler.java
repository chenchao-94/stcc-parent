package com.stcc.gateway.handler;

import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.GatewayCallbackManager;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.stcc.common.core.utils.ServletUtils;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebExceptionHandler;
import reactor.core.publisher.Mono;

/**
 * 包名 com.stcc.gateway.handler
 * 说明 自定义限流异常处理
 * 通过 spring boot2 WebFlux全局异常处理机
 * WebFlux提供了一套函数式接口
 * 在WebFlux的函数式开发模式中，我们用HandlerFunction和RouterFunction来实现上边这两点
 * ServerWebExchange命名为服务网络交换器，存放着重要的请求-响应属性、请求实例和响应实例等
 * 创建时间 2021/10/9
 * @author stcc
 */
public class SentinelFallbackHandler implements WebExceptionHandler {
    @Override
    public Mono<Void> handle(ServerWebExchange serverWebExchange, Throwable throwable) {
        //服务网络交换器获取返回值
        if (serverWebExchange.getResponse().isCommitted())
        {
            return Mono.error(throwable);
        }
        //定点异常
        if (!BlockException.isBlockException(throwable))
        {
            return Mono.error(throwable);
        }
        return handleBlockedRequest(serverWebExchange, throwable).flatMap(response -> writeResponse(response, serverWebExchange));
    }
    /** 处理请求异常 */
    private Mono<ServerResponse> handleBlockedRequest(ServerWebExchange serverWebExchange, Throwable throwable)
    {
        return GatewayCallbackManager.getBlockHandler().handleRequest(serverWebExchange, throwable);
    }

    /** 重写writeResponse（），自定义返回的异常数据 */
    private Mono<Void> writeResponse(ServerResponse response, ServerWebExchange serverWebExchange) {
        return ServletUtils.webFluxResponseWriter(serverWebExchange.getResponse(), "请求超过最大数，请稍后再试!");
    }

}
