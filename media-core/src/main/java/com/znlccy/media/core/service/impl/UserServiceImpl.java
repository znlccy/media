package com.znlccy.media.core.service.impl;

import com.znlccy.media.core.model.User;
import com.znlccy.media.core.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type UserService
 *
 * FileName：UserService.java
 * Description：	用户服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-12:24			create
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int insertSelective(User user) {
        return 0;
    }

    @Override
    public User selectById(Long id) {
        return null;
    }

    @Override
    public int updateByIdSelective(User user) {
        return 0;
    }

    @Override
    public int updateById(User user) {
        return 0;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findAllByPage(int limit, int offset) {
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
