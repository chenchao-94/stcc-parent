package com.stcc.business.controller.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 包名 com.stcc.business.controller.demo
 * 说明 demo
 * 作者 stcc
 * 创建时间 2021/7/26
 */
@RestController
@RequestMapping(value = "business")
public class DemoController {

    @RequestMapping(value = "/demo")
    public String sayhello(){
        return "hello business demo!";
    }
}
