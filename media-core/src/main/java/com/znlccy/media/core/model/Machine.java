package com.znlccy.media.core.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Machine 
 *
 * FileName：Machine.java
 * Description：	机台实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-22:34			create
 */
@Data
@ToString
public class Machine implements Serializable {

    /**
     * 生成序列号
     */
    private static final long serialVersionUID = -6488229556599605038L;

    /**
     * 机台主键
     */
    private Long id;

    /**
     * 机台名称
     */
    private String name;

    /**
     * 机台媒体
     */
    private String media;

    /**
     * 机台地址
     */
    private String location;

    /**
     * 机台场所
     */
    private String place;

    /**
     * 机台点位
     */
    private String position;

    /**
     * GPS1
     */
    private String gpsOne;

    /**
     * GPS2
     */
    private String gpsTwo;

    /**
     * 机台序列号
     */
    private String machineSerialize;

    /**
     * 填表人
     */
    private String fillMan;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}
