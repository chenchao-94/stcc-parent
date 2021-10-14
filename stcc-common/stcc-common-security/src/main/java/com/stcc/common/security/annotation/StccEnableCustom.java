package com.stcc.common.security.annotation;

import com.stcc.common.security.config.SystemApplicationConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import java.lang.annotation.*;

/**
 * 包名 com.stcc.common.security.annotation
 * 说明 开启客户端注解
 * 创建时间 2021/10/10
 * @author stcc
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@EnableAspectJAutoProxy(exposeProxy = true) // 表示通过aop框架暴露该代理对象,AopContext能够访问
@MapperScan("com.stcc.**.mapper") // 指定要扫描的Mapper类的包的路径
@EnableAsync // 开启线程异步执行
@Import({ SystemApplicationConfig.class, FeignAutoConfiguration.class }) // 自动加载类
public @interface StccEnableCustom {
}
