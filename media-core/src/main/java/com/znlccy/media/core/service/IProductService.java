package com.znlccy.media.core.service;

import com.znlccy.media.core.model.Product;

import java.util.List;

/**
 * The type IProductService
 *
 * FileName：IProductService.java
 * Description：	产品服务接口
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/14-19:29			create
 */
public interface IProductService {

    /**
     * 通过主键删除产品
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 添加商品
     * @param product
     * @return
     */
    int insert(Product product);

    /**
     * 通过所选添加商品
     * @param product
     * @return
     */
    int insertSelective(Product product);

    /**
     * 通过主键筛选
     * @param id
     * @return
     */
    Product selectById(Long id);

    /**
     * 通过所选主键更新
     * @param product
     * @return
     */
    int updateByIdSelective(Product product);

    /**
     * 通过主键更新
     * @param product
     * @return
     */
    int updateById(Product product);

    /**
     * 查找所有产品
     * @return
     */
    List<Product> findAll();

    /**
     * 通过分页查找产品
     * @param limit
     * @param offset
     * @return
     */
    List<Product> findAllByPage(int limit, int offset);

    /**
     * 通过主键批量删除
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
