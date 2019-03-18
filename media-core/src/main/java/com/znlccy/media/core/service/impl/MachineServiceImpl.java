package com.znlccy.media.core.service.impl;

import com.znlccy.media.core.model.Machine;
import com.znlccy.media.core.service.IMachineService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type MachineService 
 *
 * FileName：MachineService.java
 * Description：	机台服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-23:19			create
 */
@Service
public class MachineServiceImpl implements IMachineService {

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public int insert(Machine machine) {
        return 0;
    }

    @Override
    public int insertSelective(Machine machine) {
        return 0;
    }

    @Override
    public Machine selectById(Long id) {
        return null;
    }

    @Override
    public int updateByIdSelective(Machine machine) {
        return 0;
    }

    @Override
    public int updateById(Machine machine) {
        return 0;
    }

    @Override
    public List<Machine> findAll() {
        return null;
    }

    @Override
    public List<Machine> findAllByPage(int limit, int offset) {
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
