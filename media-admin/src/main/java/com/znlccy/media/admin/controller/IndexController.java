package com.znlccy.media.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The type IndexController
 *
 * FileName：IndexController.java
 * Description：	首页控制器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-23:22			create
 */
@Controller
public class IndexController {

    @GetMapping(value = "/")
    public String index() {
        return "/index.html";
    }
}
