package com.znlccy.media.core.service;

import com.znlccy.media.core.model.Log;

/**
 * The type ILogService
 *
 * FileName：ILogService.java
 * Description：	日志服务接口
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/14-22:31			create
 */
public interface ILogService {

    /**
     * 添加日志
     * @param log
     * @return
     */
    int saveLog(Log log);

    /**
     * 删除日志
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 查询日志
     * @param id
     * @return
     */
    Log findById(Long id);

}
