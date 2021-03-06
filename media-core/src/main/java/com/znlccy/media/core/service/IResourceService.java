package com.znlccy.media.core.service;

import com.znlccy.media.core.model.Resource;

import java.util.List;

/**
 * The type IResourceService
 *
 * FileName：IResourceService.java
 * Description：	权限服务接口
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-15:23			create
 */
public interface IResourceService {

    /**
     *通过主键删除
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 添加资源
     * @param resource
     * @return
     */
    int insert(Resource resource);

    /**
     * 通过所选添加资源
     * @param resource
     * @return
     */
    int insertSelective(Resource resource);

    /**
     * 通过主键筛选资源
     * @param id
     * @return
     */
    Resource selectById(Long id);

    /**
     * 通过所选更新资源
     * @param resource
     * @return
     */
    int updateByIdSelective(Resource resource);

    /**
     * 通过主键更新资源
     * @param resource
     * @return
     */
    int updateById(Resource resource);

    /**
     * 查找所有资源
     * @return
     */
    List<Resource> findAll();

    /**
     * 通过分页查找资源
     * @param limit
     * @param offset
     * @return
     */
    List<Resource> findAllByPage(int limit, int offset);

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
