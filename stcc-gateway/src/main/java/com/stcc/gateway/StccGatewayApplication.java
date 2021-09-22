package com.stcc.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 包名 com.stcc.gateway
 * 说明 网关启动
 * 创建时间 2021/9/14
 * @author stcc
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StccGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(StccGatewayApplication.class, args);
        System.out.println("  ===============超叔网关启动成功=============== \n " +
                "  ________  ___________  ______    ______   \n" +
                " /\"       )(\"     _   \")/\" _  \"\\  /\" _  \"\\  \n" +
                "(:   \\___/  )__/  \\\\__/(: ( \\___)(: ( \\___) \n" +
                " \\___  \\       \\\\_ /    \\/ \\      \\/ \\      \n" +
                "  __/  \\\\      |.  |    //  \\ _   //  \\ _   \n" +
                " /\" \\   :)     \\:  |   (:   _) \\ (:   _) \\  \n" +
                "(_______/       \\__|    \\_______) \\_______) \n");
    }
}
