package com.znlccy.media.core.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Log
 *
 * FileName：Log.java
 * Description：用户操作日志
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/13-8:11			create
 */
@Data
@ToString
public class Log implements Serializable {

    /**
     * 生成序列号
     */
    private static final long serialVersionUID = 7364368016922730324L;

    /**
     * 日志主键
     */
    private Long id;

    /**
     * 操作用户
     */
    private String username;

    /**
     * 用户操作
     */
    private String operation;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 请求参数
     */
    private String params;

    /**
     * 请求地址
     */
    private String ip;

    /**
     * 创建时间
     */
    private Date createTime;
}
