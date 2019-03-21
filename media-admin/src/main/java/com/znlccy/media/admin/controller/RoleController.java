package com.znlccy.media.admin.controller;

import com.znlccy.media.core.controller.BaseController;
import com.znlccy.media.core.model.Role;
import com.znlccy.media.core.service.IRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
public class RoleController extends BaseController {

    /**
     * 定义路径前缀
     */
    private static final String PREFIX = "system/role";

    /**
     * 依赖注入角色服务
     */
    @Autowired
    private IRoleService roleService;

    /**
     * 角色列表页
     * @param model
     * @return
     */
    @GetMapping(value = "/list")
    public String roleList(Model model) {

        model.addAttribute("roleList", "roleList");

        return PREFIX + "/list.html";
    }

    /**
     * 角色添加页
     * @param role
     * @param model
     * @return
     */
    @PostMapping(value = "/add")
    public String roleAdd(@RequestBody Role role, Model model) {

        model.addAttribute("role", role);
        return PREFIX + "/add.html";
    }

    /**
     * 角色编辑页
     * @param roleId
     * @param model
     * @return
     */
    @PutMapping(value = "/edit/{roleId}")
    public String roleEdit(@PathVariable Long roleId, Model model) {
        return PREFIX + "/edit.html";
    }

    /**
     * 角色详情页
     * @param roleId
     * @param model
     * @return
     */
    @GetMapping(value = "/detail/{roleId}")
    public String roleDetail(@PathVariable Long roleId, Model model) {
        return PREFIX + "/detail.html";
    }
}
