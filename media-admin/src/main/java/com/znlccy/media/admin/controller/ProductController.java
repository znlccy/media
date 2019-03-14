package com.znlccy.media.admin.controller;

import com.znlccy.media.core.model.Product;
import com.znlccy.media.core.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * The type ProductController
 *
 * FileName：ProductController.java
 * Description：	产品控制器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-23:13			create
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {

    /**
     * 定义路径前缀
     */
    private static final String PREFIX = "product";

    /**
     * 自动依赖注入产品服务
     */
    @Autowired
    private IProductService produceService;

    /**
     * 产品列表页
     * @param model
     * @return
     */
    @GetMapping(value = "/list")
    public String productList(Model model) {
        return PREFIX + "/list.html";
    }

    /**
     * 产品添加页
     * @param product
     * @param model
     * @return
     */
    @PostMapping(value = "/add")
    public String productAdd(@RequestBody Product product, Model model) {
        return PREFIX + "/add.html";
    }

    /**
     * 产品编辑页
     * @param productId
     * @param model
     * @return
     */
    @PutMapping(value = "/edit/{productId}")
    public String productEdit(@PathVariable Long productId, Model model) {
        return PREFIX + "/edit.html";
    }

    /**
     * 产品详情页
     * @param productId
     * @param model
     * @return
     */
    public String productDetail(@PathVariable Long productId, Model model) {
        return PREFIX + "/detail.html";
    }
}
