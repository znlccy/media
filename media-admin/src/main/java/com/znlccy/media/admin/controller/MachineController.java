package com.znlccy.media.admin.controller;

import com.znlccy.media.core.controller.BaseController;
import com.znlccy.media.core.model.Machine;
import com.znlccy.media.core.service.IMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * The type MachineController
 *
 * FileName：MachineController.java
 * Description：	机台控制器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-23:14			create
 */
@Controller
@RequestMapping(value = "/machine")
public class MachineController extends BaseController {

    /**
     * 定义路径前缀
     */
    private static final String PREFIX = "machine";

    /**
     * 自动依赖注入产品服务
     */
    @Autowired
    private IMachineService machineService;

    /**
     * 产品列表页
     * @param model
     * @return
     */
    @GetMapping(value = "/list")
    public String machineList(Model model) {
        return PREFIX + "/list.html";
    }

    /**
     * 产品添加页
     * @param machine
     * @param model
     * @return
     */
    @PostMapping(value = "/add")
    public String machineAdd(@RequestBody Machine machine, Model model) {
        return PREFIX + "/add.html";
    }

    /**
     * 产品编辑页
     * @param machineId
     * @param model
     * @return
     */
    @PutMapping(value = "/edit/{machineId}")
    public String machineEdit(@PathVariable Long machineId, Model model) {
        return PREFIX + "/edit.html";
    }

    /**
     * 产品详情页
     * @param machineId
     * @param model
     * @return
     */
    public String machineDetail(@PathVariable Long machineId, Model model) {
        return PREFIX + "/detail.html";
    }
}
