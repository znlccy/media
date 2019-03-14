package com.znlccy.media.core.service;

import com.znlccy.media.core.model.Carousel;

import java.util.List;

/**
 * The type ICarouseService
 *
 * FileName：ICarouseService.java
 * Description：	轮播服务接口
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/14-19:21			create
 */
public interface ICarouseService {

    /**
     * 通过主键删除
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 添加轮播
     * @param carousel
     * @return
     */
    int insert(Carousel carousel);

    /**
     * 通过筛选添加轮播
     * @param carousel
     * @return
     */
    int insertSelective(Carousel carousel);

    /**
     * 通过主键筛选轮播
     * @param id
     * @return
     */
    Carousel selectById(Long id);

    /**
     * 通过所选主键更新轮播
     * @param carousel
     * @return
     */
    int updateByIdSelective(Carousel carousel);

    /**
     * 通过主键更新轮播
     * @param carousel
     * @return
     */
    int updateById(Carousel carousel);

    /**
     * 查找所有轮播
     * @return
     */
    List<Carousel> findAll();

    /**
     * 通过分页查找所有轮播
     * @param limit
     * @param offset
     * @return
     */
    List<Carousel> findAllByPage(int limit, int offset);

    /**
     * 通过主键批量删除轮播
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
