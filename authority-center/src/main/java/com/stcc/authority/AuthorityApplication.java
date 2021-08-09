package com.stcc.authority;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 包名 com.stcc.authority
 * 说明 权限中心
 * 作者 stcc
 * 创建时间 2021/7/6
 */
@SpringBootApplication
@EnableDiscoveryClient   //启动注册
@MapperScan("com.stcc.authority.dao") //扫描dao
public class AuthorityApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthorityApplication.class,args);
    }
}
