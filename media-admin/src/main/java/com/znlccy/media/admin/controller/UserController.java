package com.znlccy.media.admin.controller;

import com.znlccy.media.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
public class UserController {

    @Autowired
    private IUserService userService;
}
