package com.stcc.study.javaEE.day02;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

/**
 * 包名 com.stcc.study.javaEE.day02
 * 说明
 * 作者 stcc
 * 创建时间 2021/10/4
 * @author stcc
 */
public class OssWoYun {
    public static void main(String[] args) {
        BasicAWSCredentials basicAwsCred = new BasicAWSCredentials("FB7C42A1A7A14C7D9392B2975A3F932D7619", "6353F2B771134A88B32CC44EFD6C5C486059");
        AmazonS3 s3 = new AmazonS3Client(basicAwsCred);
        s3.setEndpoint("obs-helf.woyun.cn");

    }
}
