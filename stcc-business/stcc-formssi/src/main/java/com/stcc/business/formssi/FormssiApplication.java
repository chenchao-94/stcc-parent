package com.stcc.business.formssi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 包名 com.stcc.business.formssi
 * 说明 练习组件启动
 * 创建时间 2022/6/14
 * @author stcc
 */
@SpringBootApplication
public class FormssiApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(FormssiApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
