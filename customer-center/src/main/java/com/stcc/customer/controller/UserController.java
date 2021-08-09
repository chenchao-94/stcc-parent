package com.stcc.customer.controller;

import com.stcc.customer.entity.User;
import com.stcc.customer.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户表 (User)表控制层
 *
 * @author stcc
 * @since 2021-08-04 17:11:14
 */
@Api(tags = "用户信息controller")
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "通过主键查询单条数据")
    @PostMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

}