package com.znlccy.media.core.service.impl;

import com.znlccy.media.core.mapper.CarouselMapper;
import com.znlccy.media.core.service.ICarouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type CarouselService
 *
 * FileName：CarouselService.java
 * Description：	轮播服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-23:18			create
 */
@Service
public class CarouselServiceImpl implements ICarouseService {

    @Autowired
    private CarouselMapper carouselMapper;

    /**
     * 通过主键
     * @param id
     * @return
     */
    @Override
    public int deleteById(Long id) {
        return carouselMapper.deleteById(id);
    }

}