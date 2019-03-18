package com.znlccy.media.core.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

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
     * 下单人员编号
     */
    private Long orderClerkNumber;

    /**
     * 广告商编号
     */
    private Long advertiserNumber;

    /**
     * 产品编号
     */
    private Long productId;

    /**
     * 预计上刊时间
     */
    private Date expectedUpPublish;

    /**
     * 预计上刊时间
     */
    private Date expectedDownPublish;

}
