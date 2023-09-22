package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * ClassName: UserMapper
 * Package: com.kob.mapper
 * Description:
 *
 * @Author: 闫守瑞
 * @Create: 2023/9/14 - 12:53
 * @Version: v1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
