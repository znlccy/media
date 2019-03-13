package com.znlccy.media.core.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Product
 *
 * FileName：Product.java
 * Description：	产品实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-22:14			create
 */
@Data
@ToString
public class Product implements Serializable {

    /**
     * 生成序列号
     */
    private static final long serialVersionUID = 9160981983459861148L;

    /**
     * 产品主键
     */
    private Long id;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 产品版位
     */
    private String position;

    /**
     * 产品地区
     */
    private String region;

    /**
     * 产品场所
     */
    private String place;

    /**
     * 贩售单位
     */
    private String sellUnit;

    /**
     * 贩售数量
     */
    private String sellNumber;

    /**
     * 上架时间
     */
    private Date upTime;

    /**
     * 下架时间
     */
    private Date downTime;

}
