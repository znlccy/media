package com.znlccy.media.core.service.impl;

import com.znlccy.media.core.model.Order;
import com.znlccy.media.core.service.IOrderService;

import java.util.List;

/**
 * The type OrderServiceImpl
 *
 * FileName：OrderServiceImpl.java
 * Description：订单服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/14-19:28			create
 */
public class OrderServiceImpl implements IOrderService {

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public int insert(Order order) {
        return 0;
    }

    @Override
    public int insertSelective(Order order) {
        return 0;
    }

    @Override
    public Order selectById(Long id) {
        return null;
    }

    @Override
    public int updateByIdSelective(Order order) {
        return 0;
    }

    @Override
    public int updateById(Order order) {
        return 0;
    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public List<Order> findAllByPage(int limit, int offset) {
        return null;
    }

    @Override
    public int batchDeleteByIds(List<Long> ids) {
        return 0;
    }

    @Override
    public int batchUpdateByIds(List<Long> ids) {
        return 0;
    }
}
