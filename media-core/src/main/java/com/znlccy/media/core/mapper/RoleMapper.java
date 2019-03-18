package com.znlccy.media.core.mapper;

import com.znlccy.media.core.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * The type RoleMapper
 *
 * FileName：RoleMapper.java
 * Description：	角色映射类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-12:24			create
 */
@Mapper
public interface RoleMapper {

    /**
     * 通过主键删除
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 添加角色
     * @param role
     * @return
     */
    int insert(Role role);

    /**
     * 通过筛选添加角色
     * @param role
     * @return
     */
    int insertSelective(Role role);

    /**
     * 通过主键筛选角色
     * @param id
     * @return
     */
    Role selectById(Long id);

    /**
     * 通过所选更新角色
     * @param role
     * @return
     */
    int updateByIdSelective(Role role);

    /**
     * 通过主键更新角色
     * @param role
     * @return
     */
    int updateById(Role role);

    /**
     * 查找所有角色
     * @return
     */
    List<Role> findAll();

    /**
     * 通过分页查找所有角色
     * @param limit
     * @param offset
     * @return
     */
    List<Role> findAllByPage(int limit, int offset);

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
