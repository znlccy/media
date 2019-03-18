package com.znlccy.media.core.service.impl;

import com.znlccy.media.core.model.Advertise;
import com.znlccy.media.core.service.IAdvertiseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type AdvertiseService
 *
 * FileName：AdvertiseService.java
 * Description：	广告服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-23:18			create
 */
@Service
public class AdvertiseServiceImpl implements IAdvertiseService {

    /**
     * 通过主键删除广告
     * @param id
     * @return
     */
    @Override
    public int deleteById(Long id) {
        return 0;
    }

    /**
     * 添加广告
     * @param advertise
     * @return
     */
    @Override
    public int insert(Advertise advertise) {
        return 0;
    }

    /**
     * 通过所选添加广告
     * @param advertise
     * @return
     */
    @Override
    public int insertSelective(Advertise advertise) {
        return 0;
    }

    /**
     * 通过主键查找广告
     * @param id
     * @return
     */
    @Override
    public Advertise selectById(Long id) {
        return null;
    }

    /**
     * 通过所选主键更新广告
     * @param advertise
     * @return
     */
    @Override
    public int updateByIdSelective(Advertise advertise) {
        return 0;
    }

    /**
     * 通过主键更新广告
     * @param advertise
     * @return
     */
    @Override
    public int updateById(Advertise advertise) {
        return 0;
    }

    /**
     * 查找所有广告
     * @return
     */
    @Override
    public List<Advertise> findAll() {
        return null;
    }

    /**
     * 通过分页查找所有广告
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public List<Advertise> findAllByPage(int limit, int offset) {
        return null;
    }

    /**
     * 通过主键批量删除广告
     * @param ids
     * @return
     */
    @Override
    public int batchDeleteByIds(List<Long> ids) {
        return 0;
    }

    /**
     * 通过主键批量更新
     * @param ids
     * @return
     */
    @Override
    public int batchUpdateByIds(List<Long> ids) {
        return 0;
    }
}
