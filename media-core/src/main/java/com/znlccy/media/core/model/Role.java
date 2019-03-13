package com.znlccy.media.core.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Role
 *
 * FileName：Role.java
 * Description：	角色实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-12:02			create
 */
@Data
@ToString
public class Role implements Serializable {

    private static final long serialVersionUID = 3891790204368183450L;

    /**
     * 角色主键
     */
    private Long id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 角色实现
     */
    private String role;

    /**
     * 角色权重
     */
    private Integer weight;

    /**
     * 角色状态
     */
    private Integer status;

    /**
     * 角色类型
     */
    private Integer type;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
