package com.stcc.authority.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 包名 com.stcc.authority.controller
 * 说明
 * 作者 stcc
 * 创建时间 2021/7/6
 */
@RestController
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/say")
    public String say(){
        redisTemplate.opsForValue().set("www","1111111");
        return (String) redisTemplate.opsForValue().get("www");
    }
}
