package com.znlccy.media.admin.controller;

import com.znlccy.media.core.controller.BaseController;
import com.znlccy.media.core.model.Resource;
import com.znlccy.media.core.service.IResourceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * The type ResourceController
 *
 * FileName：ResourceController.java
 * Description：	资源/权限控制器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-23:14			create
 */
@Controller
@RequestMapping(value = "/resource")
public class ResourceController extends BaseController {

    /**
     * 定义路径前缀
     */
    private static String PREFIX = "system/resource";

    /**
     * 依赖注入权限服务
     */
    private IResourceService resouceService;

    /**
     * 权限列表页
     * @param model
     * @return
     */
    @GetMapping(value = "/list")
    public String resourceList(Model model) {
        model.addAttribute("resourceList", "resourceList");
        return PREFIX + "/list.html";
    }

    /**
     * 权限添加页
     * @param resource
     * @param model
     * @return
     */
    @PostMapping(value = "/add")
    public String resourceAdd(@RequestBody Resource resource, Model model) {
        model.addAttribute("resource", resource);
        return PREFIX + "/add.html";
    }

    /**
     * 权限编辑页
     * @param resourceId
     * @param model
     * @return
     */
    @PutMapping(value = "/edit/{resourceId}")
    public String resourceEdit(@PathVariable Long resourceId, Model model) {
        model.addAttribute("resource","resource");
        return PREFIX + "/edit.html";
    }

    /**
     * 权限详情
     * @param resourceId
     * @param model
     * @return
     */
    public String resourceDetail(@PathVariable Long resourceId, Model model) {
        model.addAttribute("resource", "resource");
        return PREFIX + "/detail.html";
    }
}
