package com.znlccy.media.admin.controller;

import com.znlccy.media.core.dto.UserDTO;
import com.znlccy.media.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The type UserController
 *
 * FileName：UserController.java
 * Description：	用户控制器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-11:19			create
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    /**
     * 定义
     */
    private static final String PREFIX = "/system/user";

    /**
     * 依赖注入用户服务
     */
    @Autowired
    private IUserService userService;

    /**
     * 用户列表页
     * @return
     */
    public String userList() {

        return PREFIX + "/list.html";
    }


    public String userEdit() {
        return null;
    }

    public Object userDelete() {
        return null;
    }

    /**
     * 用户退出页面
     */
    public void logout() {

    }
}
