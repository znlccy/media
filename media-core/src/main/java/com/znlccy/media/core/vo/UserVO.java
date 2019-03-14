package com.znlccy.media.core.vo;

import lombok.Data;

/**
 * The type UserVO
 *
 * FileName：UserVO.java
 * Description：	用户传输视图
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/14-17:49			create
 */

@Data
public class UserVO {

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;
}
