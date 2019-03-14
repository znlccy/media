package com.znlccy.media.core.service;

import com.znlccy.media.core.model.Advertise;

import java.util.List;

/**
 * The type IAdvertiseService
 *
 * FileName：IAdvertiseService.java
 * Description：	广告服务接口
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/14-19:20			create
 */
public interface IAdvertiseService {

    /**
     * 通过主键删除
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 添加广告
     * @param advertise
     * @return
     */
    int insert(Advertise advertise);

    /**
     * 选择添加广告
     * @param advertise
     * @return
     */
    int insertSelective(Advertise advertise);

    /**
     * 通过主键筛选广告
     * @param id
     * @return
     */
    Advertise selectById(Long id);

    /**
     * 通过所选更新广告
     * @param advertise
     * @return
     */
    int updateByIdSelective(Advertise advertise);

    /**
     * 通过主键更新广告
     * @param advertise
     * @return
     */
    int updateById(Advertise advertise);

    /**
     * 查询所有广告
     * @return
     */
    List<Advertise> findAll();

    /**
     * 通过分页查找广告
     * @param limit
     * @param offset
     * @return
     */
    List<Advertise> findAllByPage(int limit, int offset);

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
