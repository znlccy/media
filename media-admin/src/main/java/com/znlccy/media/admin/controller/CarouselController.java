package com.znlccy.media.admin.controller;

import com.znlccy.media.core.model.Carousel;
import com.znlccy.media.core.service.ICarouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * The type CarouselController
 *
 * FileName：CarouselController.java
 * Description：	轮播控制器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-23:13			create
 */
@Controller
@RequestMapping(value = "/carousel")
public class CarouselController {

    /**
     * 定义路径前缀
     */
    private static final String PREFIX = "carousel";

    /**
     * 自动依赖注入产品服务
     */
    @Autowired
    private ICarouseService carouseService;

    /**
     * 产品列表页
     * @param model
     * @return
     */
    @GetMapping(value = "/list")
    public String carouselList(Model model) {
        return PREFIX + "/list.html";
    }

    /**
     * 产品添加页
     * @param carousel
     * @param model
     * @return
     */
    @PostMapping(value = "/add")
    public String carouselAdd(@RequestBody Carousel carousel, Model model) {
        return PREFIX + "/add.html";
    }

    /**
     * 产品编辑页
     * @param carouselId
     * @param model
     * @return
     */
    @PutMapping(value = "/edit/{carouselId}")
    public String carouselEdit(@PathVariable Long carouselId, Model model) {
        return PREFIX + "/edit.html";
    }

    /**
     * 产品详情页
     * @param carouselId
     * @param model
     * @return
     */
    public String carouselDetail(@PathVariable Long carouselId, Model model) {
        return PREFIX + "/detail.html";
    }
}
