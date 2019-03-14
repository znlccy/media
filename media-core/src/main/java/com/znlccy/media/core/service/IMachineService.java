package com.znlccy.media.core.service;

import com.znlccy.media.core.model.Machine;

import java.util.List;

/**
 * The type IMachineService
 *
 * FileName：IMachineService.java
 * Description：	机台服务接口
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/14-19:22			create
 */
public interface IMachineService {

    /**
     * 通过主键删除
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 添加机台
     * @param machine
     * @return
     */
    int insert(Machine machine);

    /**
     * 通过筛选添加机台
     * @param machine
     * @return
     */
    int insertSelective(Machine machine);

    /**
     * 通过主键筛选机台
     * @param id
     * @return
     */
    Machine selectById(Long id);

    /**
     * 通过选择更新机台
     * @param machine
     * @return
     */
    int updateByIdSelective(Machine machine);

    /**
     * 通过主键更新
     * @param Machine
     * @return
     */
    int updateById(Machine Machine);

    /**
     * 查询所有机台
     * @return
     */
    List<Machine> findAll();

    /**
     * 通过分页查询所有机台
     * @param limit
     * @param offset
     * @return
     */
    List<Machine> findAllByPage(int limit, int offset);

    /**
     * 通过主键批量删除机台
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
