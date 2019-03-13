package com.znlccy.media.core.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Carousel
 *
 * FileName：Carousel.java
 * Description：	轮播实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-12:16			create
 */
@Data
@ToString
public class Carousel implements Serializable {

    /**
     * 生成序列号
     */
    private static final long serialVersionUID = 5555593276574795052L;

    /**
     * 轮播主键
     */
    private Long id;

    /**
     * 轮播描述
     */
    private String description;

    /**
     * 跳转路径
     */
    private String url;

    /**
     * 图片路径
     */
    private String path;

    /**
     * 轮播状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
