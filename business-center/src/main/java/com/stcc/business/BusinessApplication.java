package com.stcc.business;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 包名 com.stcc.business
 * 说明 业务中心启动
 * 作者 stcc
 * 创建时间 2021/7/26
 */
@SpringBootApplication
@EnableDiscoveryClient   //启动注册
@MapperScan("com.stcc.business.dao") //扫描dao
public class BusinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class,args);
    }
}
