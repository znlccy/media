package com.znlccy.media.core.service.impl;

import com.znlccy.media.core.model.Carousel;
import com.znlccy.media.core.service.ICarouseService;
import org.springframework.stereotype.Service;

import java.util.List;

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
public class CarouselService implements ICarouseService {

    /**
     * 通过主键
     * @param id
     * @return
     */
    @Override
    public int deleteById(Long id) {
        return 0;
    }

    /**
     * 添加
     * @param carousel
     * @return
     */
    @Override
    public int insert(Carousel carousel) {
        return 0;
    }

    /**
     *
     * @param carousel
     * @return
     */
    @Override
    public int insertSelective(Carousel carousel) {
        return 0;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Carousel selectById(Long id) {
        return null;
    }

    /**
     *
     * @param carousel
     * @return
     */
    @Override
    public int updateByIdSelective(Carousel carousel) {
        return 0;
    }

    /**
     *
     * @param carousel
     * @return
     */
    @Override
    public int updateById(Carousel carousel) {
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Carousel> findAll() {
        return null;
    }

    /**
     *
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public List<Carousel> findAllByPage(int limit, int offset) {
        return null;
    }

    /**
     *
     * @param ids
     * @return
     */
    @Override
    public int batchDeleteByIds(List<Long> ids) {
        return 0;
    }

    /**
     *
     * @param ids
     * @return
     */
    @Override
    public int batchUpdateByIds(List<Long> ids) {
        return 0;
    }
}
