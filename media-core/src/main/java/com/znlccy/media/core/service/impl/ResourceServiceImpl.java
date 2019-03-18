package com.znlccy.media.core.service.impl;

import com.znlccy.media.core.model.Resource;
import com.znlccy.media.core.service.IResourceService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type ResourceService
 *
 * FileName：ResourceService.java
 * Description：	资源服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-23:20			create
 */
@Service
public class ResourceServiceImpl implements IResourceService {

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public int insert(Resource resource) {
        return 0;
    }

    @Override
    public int insertSelective(Resource resource) {
        return 0;
    }

    @Override
    public Resource selectById(Long id) {
        return null;
    }

    @Override
    public int updateByIdSelective(Resource resource) {
        return 0;
    }

    @Override
    public int updateById(Resource resource) {
        return 0;
    }

    @Override
    public List<Resource> findAll() {
        return null;
    }

    @Override
    public List<Resource> findAllByPage(int limit, int offset) {
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
