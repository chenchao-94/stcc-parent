package com.stcc.common.security.annotation;

import org.springframework.cloud.openfeign.EnableFeignClients;

import java.lang.annotation.*;

/**
 * 包名 com.stcc.common.security.annotation
 * 说明 自定义feign客户端注解
 * 创建时间 2021/10/10
 * @author stcc
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableFeignClients
public @interface StccEnableFeignClient {
    String[] value() default {};

    String[] basePackages() default { "com.stcc" };

    Class<?>[] basePackageClasses() default {};

    Class<?>[] defaultConfiguration() default {};

    Class<?>[] clients() default {};
}
