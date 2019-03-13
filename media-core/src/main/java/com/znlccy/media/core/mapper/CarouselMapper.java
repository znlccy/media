package com.znlccy.media.core.mapper;

import com.znlccy.media.core.model.Carousel;
import org.apache.ibatis.annotations.Mapper;

/**
 * The type CarouselMapper
 *
 * FileName：CarouselMapper.java
 * Description：	轮播映射类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-14:42			create
 */
@Mapper
public interface CarouselMapper {

    Carousel findCarouselById(Long id);


}
