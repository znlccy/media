package com.znlccy.media.core.annotation;

/**
 * The type Permission
 *
 * FileName：Permission.java
 * Description：	权限注解
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-22:40			create
 */
public @interface Permission {

    /**
     * 权限值
     * @return
     */
    String value() default "";

}
