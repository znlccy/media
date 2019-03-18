package com.znlccy.media.core.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * The type User
 *
 * FileName：User.java
 * Description：	用户实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-12:01			create
 */
@Data
@ToString
public class User implements Serializable {

    /**
     * 用户主键
     */
    private Long id;

    /**
     *  用户姓名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户手机
     */
    private String mobile;

    /**
     * 用户状态
     */
    private Integer status;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 角色
     */
    private String role;

    /**
     * 登录时间
     */
    private Date loginTime;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
