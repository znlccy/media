package com.znlccy.media.core.service;

import com.znlccy.media.core.model.Carousel;

/**
 * The type ICarouseService
 *
 * FileName：ICarouseService.java
 * Description：	轮播服务接口
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/14-19:21			create
 */
public interface ICarouseService {

    /**
     * 保存轮播
     * @param carousel
     * @return
     */
    int saveCarousel(Carousel carousel);

    /**
     * 通过主键删除
     * @param id
     * @return
     */
    int deleteById(Long id);

}
