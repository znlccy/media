package com.znlccy.media.core.service;

import com.znlccy.media.core.model.User;

import java.util.List;

/**
 * The type IUserService
 *
 * FileName：IUserService.java
 * Description：	用户服务接口
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-12:16			create
 */
public interface IUserService {

    /**
     * 通过主键删除
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 通过所选筛选用户
     * @param user
     * @return
     */
    int insertSelective(User user);

    /**
     * 通过主键筛选用户
     * @param id
     * @return
     */
    User selectById(Long id);

    /**
     * 通过所选主键更新用户
     * @param user
     * @return
     */
    int updateByIdSelective(User user);

    /**
     * 通过主键更新用户
     * @param user
     * @return
     */
    int updateById(User user);

    /**
     * 查找所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 通过分页查找用户
     * @param limit
     * @param offset
     * @return
     */
    List<User> findAllByPage(int limit, int offset);

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
