package com.stcc.consumers;

import com.stcc.common.security.annotation.StccEnableCustom;
import com.stcc.common.security.annotation.StccEnableFeignClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 包名 com.stcc.consumers
 * 说明 用户中心启动类
 * 创建时间 2021/10/9
 * @author stcc
 */
@SpringBootApplication
@StccEnableCustom
@StccEnableFeignClient
public class StccConsumersApplication {
    public static void main(String[] args) {
        SpringApplication.run(StccConsumersApplication.class, args);
        System.out.println("===============用户中心启动成功=============== \n " +
                "  ________  ___________  ______    ______   \n" +
                " /\"       )(\"     _   \")/\" _  \"\\  /\" _  \"\\  \n" +
                "(:   \\___/  )__/  \\\\__/(: ( \\___)(: ( \\___) \n" +
                " \\___  \\       \\\\_ /    \\/ \\      \\/ \\      \n" +
                "  __/  \\\\      |.  |    //  \\ _   //  \\ _   \n" +
                " /\" \\   :)     \\:  |   (:   _) \\ (:   _) \\  \n" +
                "(_______/       \\__|    \\_______) \\_______) \n");
    }
}
