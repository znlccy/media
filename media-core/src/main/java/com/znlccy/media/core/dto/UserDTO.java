package com.znlccy.media.core.dto;

import lombok.Data;

/**
 * The type UserDTO
 *
 * FileName：UserDTO.java
 * Description：	用户传输对象
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/14-17:51			create
 */
@Data
public class UserDTO {

    /**
     * 用户主键
     */
    /*private Long id;*/

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

}
