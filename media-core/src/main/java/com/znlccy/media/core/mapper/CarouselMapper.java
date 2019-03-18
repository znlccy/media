package com.znlccy.media.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 通过主键删除
     * @param id
     * @return
     */
    /*@Delete("delete from tb_carousel where id = #{id}")*/
    int deleteById(@Param("id") Long id);

}
