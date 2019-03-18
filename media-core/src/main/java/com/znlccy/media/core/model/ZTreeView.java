package com.znlccy.media.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * The type ZTreeView 
 *
 * FileName：ZTreeView.java
 * Description：	权限视图
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/18-10:25			create
 */
@Data
@ToString
@NoArgsConstructor
public class ZTreeView implements Serializable {

    /**
     * 生成序列号
     */
    private static final long serialVersionUID = 5365658770651225548L;

    /**
     * 权限树主键
     */
    private Long id;

    /**
     * 权限树父节点
     */
    private Long pId;

    /**
     * 权限树名称
     */
    private String name;

    /**
     * 权限树是否打开
     */
    private Boolean open;

    /**
     * 权限树是否选中
     */
    private Boolean checked = false;
}
