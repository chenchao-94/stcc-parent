package com.stcc.business.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 包名 com.stcc.business.config
 * 说明 华为云obs配置
 * 作者 stcc
 * 创建时间 2021/7/26
 */
@Configuration
@Data
public class ObsClientConfig {

    /*终端节点访问*/
    @Value("${obs.endPoint}")
    private String endPoint;

    /*桶名称*/
    @Value("${obs.bucketName}")
    private String bucketName;

    @Value("${obs.accessKey}")
    private String accessKey;

    @Value("${obs.accessSecret}")
    private String accessSecret;
}
