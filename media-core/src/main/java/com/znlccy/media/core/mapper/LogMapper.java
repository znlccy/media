package com.znlccy.media.core.mapper;

import com.znlccy.media.core.model.Log;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The type LogMapper
 *
 * FileName：LogMapper.java
 * Description：	日志映射器
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/14-21:54			create
 */
@Mapper
public interface LogMapper {

    /**
     * 添加日志
     * @param log
     * @return
     */
    int saveLog(@Param("log")Log log);

    /**
     * 通过主键删除
     * @param id
     * @return
     */
    int deleteById(@Param("id")Long id);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int batchDeleteByIds(@Param("ids")List<Long> ids);

    /**
     * 分页查找
     * @param limit
     * @param offset
     * @return
     */
    List<Log> findByPage(@Param("limit")Integer limit, @Param("offset")Integer offset);

    /**
     * 通过主键删除
     * @param id
     * @return
     */
    Log findById(@Param("id")Long id);
}
