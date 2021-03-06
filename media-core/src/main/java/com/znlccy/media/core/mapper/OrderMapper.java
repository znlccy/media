package com.znlccy.media.core.mapper;

import com.znlccy.media.core.model.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * The type OrderMapper
 *
 * FileName：OrderMapper.java
 * Description：	订单映射类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/14-17:58			create
 */
@Mapper
public interface OrderMapper {

    /**
     * 通过主键删除订单
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 添加订单
     * @param order
     * @return
     */
    int insert(Order order);

    /**
     * 通过所选添加订单
     * @param order
     * @return
     */
    int insertSelective(Order order);

    /**
     * 通过主键筛选订单
     * @param id
     * @return
     */
    Order selectById(Long id);

    /**
     * 通过所选更新订单
     * @param order
     * @return
     */
    int updateByIdSelective(Order order);

    /**
     * 通过主键更新订单
     * @param order
     * @return
     */
    int updateById(Order order);

    /**
     * 查找所有订单
     * @return
     */
    List<Order> findAll();

    /**
     * 通过分页查找所有订单
     * @param limit
     * @param offset
     * @return
     */
    List<Order> findAllByPage(int limit, int offset);

    /**
     * 通过主键批量删除订单
     * @param ids
     * @return
     */
    int batchDeleteByIds(List<Long> ids);

    /**
     * 通过主键批量更新
     * @param ids
     * @return
     */
    int batchUpdateByIds(List<Long> ids);
}
