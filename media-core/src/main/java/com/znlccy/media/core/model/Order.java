package com.znlccy.media.core.model;

import lombok.Data;
import lombok.ToString;

/**
 * The type Order
 *
 * FileName：Order.java
 * Description：	订单实体类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/14-17:42			create
 */
@Data
@ToString
public class Order {

    /**
     * 订单主键
     */
    private Long id;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 机台名称
     */
    private String machineName;
}
