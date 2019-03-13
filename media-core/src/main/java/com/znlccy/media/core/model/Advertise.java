package com.znlccy.media.core.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Advertise
 *
 * FileName：Advertise.java
 * Description：	广告实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-22:17			create
 */
@Data
@ToString
public class Advertise implements Serializable {

    /**
     * 生成序列号
     */
    private static final long serialVersionUID = -5611089484028009537L;

    /**
     * 广告主键
     */
    private Long id;

    /**
     * 广告名称
     */
    private String name;

    /**
     * 广告描述
     */
    private String description;

    /**
     * 广告状态
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
