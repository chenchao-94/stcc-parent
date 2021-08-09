package com.stcc.customer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 包名 com.stcc.customer
 * 说明 用户中心启动类
 * 作者 stcc
 * 创建时间 2021/7/6
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.stcc.customer.dao") //扫描dao
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class,args);
    }
}
