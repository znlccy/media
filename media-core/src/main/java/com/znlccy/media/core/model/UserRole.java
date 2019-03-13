package com.znlccy.media.core.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * The type UserRole
 *
 * FileName：UserRole.java
 * Description：用户角色实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/13-8:20			create
 */

@Data
@ToString
public class UserRole implements Serializable {

    /**
     * 生成序列号
     */
    private static final long serialVersionUID = -5309114557071213000L;

    /**
     * 用户角色主键
     */
    private Long id;

    /**
     * 用户主键
     */
    private Long userId;

    /**
     * 角色主键
     */
    private Long roleId;
}
