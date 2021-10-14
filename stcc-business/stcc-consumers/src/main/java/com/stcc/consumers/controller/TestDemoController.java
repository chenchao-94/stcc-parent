package com.stcc.consumers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 包名 com.stcc.consumers.controller
 * 说明
 * 作者 stcc
 * 创建时间 2021/10/10
 * @author stcc
 */
@RestController
@RequestMapping(value = "testDemo")
public class TestDemoController {

    @GetMapping(value = "/testDemo")
    public String testDemo(){
        return "stcc-consumers success!";
    }
}
