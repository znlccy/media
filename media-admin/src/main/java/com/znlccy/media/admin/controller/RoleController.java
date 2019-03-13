package com.znlccy.media.admin.controller;

import com.znlccy.media.core.service.IRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The type RoleController
 *
 * FileName：RoleController.java
 * Description：	角色控制器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-23:14			create
 */
@Controller
@RequestMapping(value = "/role")
@Slf4j
public class RoleController {

    /**
     * 定义路径前缀
     */
    private static final String PREFIX = "/system/role/";

    /**
     * 依赖注入角色服务
     */
    @Autowired
    private IRoleService roleService;

    /**
     * 权限列表
     * @return
     */
    @GetMapping(value = "/list")
    public String roleList(Model model) {

        return PREFIX + "list";
    }
}
