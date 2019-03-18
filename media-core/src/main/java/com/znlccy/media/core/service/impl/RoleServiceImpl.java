package com.znlccy.media.core.service.impl;

import com.znlccy.media.core.model.Role;
import com.znlccy.media.core.service.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type RoleService
 *
 * FileName：RoleService.java
 * Description：	角色服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-23:20			create
 */
@Service
public class RoleServiceImpl implements IRoleService {

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public int insert(Role role) {
        return 0;
    }

    @Override
    public int insertSelective(Role role) {
        return 0;
    }

    @Override
    public Role selectById(Long id) {
        return null;
    }

    @Override
    public int updateByIdSelective(Role role) {
        return 0;
    }

    @Override
    public int updateById(Role role) {
        return 0;
    }

    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public List<Role> findAllByPage(int limit, int offset) {
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
