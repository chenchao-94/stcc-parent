package com.stcc.customer.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表 (User)实体类
 *
 * @author stcc
 * @since 2021-08-04 17:10:50
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -15274108092200389L;
    /**
    * 用户ID
    */
    private Integer userId;
    /**
    * 用户名
    */
    private String name;
    /**
    * 昵称
    */
    private String nickname;
    /**
    * 密码
    */
    private String password;
    /**
    * 手机号
    */
    private String telephone;
    /**
    * 性别 1:男，2:女
    */
    private Integer sex;
    /**
    * 出生日期
    */
    private String birthday;
    /**
    * 用户类型
    */
    private Integer userType;
    /**
    * 注册时间
    */
    private Date registerTime;
    /**
    * 用户头像
    */
    private String headPictureUrl;
    /**
    * 登录失败次数
    */
    private Integer loginFailTime;
    /**
    * 最近一次登录时间
    */
    private Date lastLoginTime;
    /**
    * 用户状态 1:正常，2无效
    */
    private Integer status;
    /**
    * 用户ip
    */
    private String userIp;
    /**
    * 是否首次登陆 1：首次，2:非首次
    */
    private Integer isFirstLogin;



}