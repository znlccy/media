package com.znlccy.media.core.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * The type RoleResource
 *
 * FileName：RoleResource.java
 * Description：	角色权限实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/13-8:21			create
 */
@Data
@ToString
public class RoleResource implements Serializable {

    /**
     * 生成序列号
     */
    private static final long serialVersionUID = -5749511827490544279L;

    /**
     * 角色权限主键
     */
    private Long id;

    /**
     * 角色主键
     */
    private Long roleId;

    /**
     * 资源主键
     */
    private Long resourceId;
}
