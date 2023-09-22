package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.Bot;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: BotMapper
 * Package: com.kob.backend.mapper
 * Description:
 *
 * @Author: 闫守瑞
 * @Create: 2023/9/21 - 16:43
 * @Version: v1.0
 */

@Mapper
public interface BotMapper extends BaseMapper<Bot> {
}

