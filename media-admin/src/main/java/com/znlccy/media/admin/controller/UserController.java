package com.znlccy.media.admin.controller;

import com.znlccy.media.core.controller.BaseController;
import com.znlccy.media.core.dto.UserDTO;
import com.znlccy.media.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
@CrossOrigin
public class UserController extends BaseController {

    /**
     * 定义路径前缀
     */
    private static final String PREFIX = "system/user";

    /**
     * 依赖注入用户服务
     */
    @Autowired
    private IUserService userService;

    /**
     * 用户列表页
     * @return
     */
    @GetMapping(value = "/list")
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
     *
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userLogin(@RequestBody UserDTO userDTO) {
        System.out.println("用户名" + userDTO.getUsername());

        if (userDTO.getUsername().equals("admin") && userDTO.getPassword().equals("123456")) {
            return "index.html";
        } else {
            return "login.html";
        }
    }

    /**
     * 用户退出页面
     */
    public void logout() {
        
    }
}
