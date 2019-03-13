package com.znlccy.media.core.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Resource
 *
 * FileName：Resource.java
 * Description：	资源实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-12:02			create
 */
@Data
@ToString
public class Resource implements Serializable {

    /**
     * 生成序列号
     */
    private static final long serialVersionUID = 2080854529774046914L;

    /**
     * 权限主键
     */
    private Long id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限类型
     */
    private Integer type;

    /**
     * 权限父节点
     */
    private Long parentId;

    /**
     * 权限路径
     */
    private String url;

    /**
     * 权限图标
     */
    private String icon;

    /**
     * 权限实现
     */
    private String permission;

    /**
     * 权限排序
     */
    private Integer order;

    /**
     * 权限备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
