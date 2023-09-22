package com.kob.backend.service.user.bot;

import java.util.Map;

/**
 * ClassName: UpdateService
 * Package: com.kob.backend.service.impl.user.bot
 * Description:
 *
 * @Author: 闫守瑞
 * @Create: 2023/9/21 - 16:49
 * @Version: v1.0
 */
public interface UpdateService {
    Map<String, String> update(Map<String, String> data);
}
