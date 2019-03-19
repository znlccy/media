package com.znlccy.media.core.mapper;

import com.znlccy.media.core.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * The type UserMapper
 *
 * FileName：UserMapper.java
 * Description：	用户映射类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-21:56			create
 */
@Mapper
public interface UserMapper {

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
    int saveUser(User user);

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
