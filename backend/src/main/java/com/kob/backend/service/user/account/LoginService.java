package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * ClassName: LogininService
 * Package: com.kob.backend.service.user.account
 * Description:
 *
 * @Author: 闫守瑞
 * @Create: 2023/9/19 - 8:54
 * @Version: v1.0
 */
public interface LoginService {
    public Map<String, String> getToken(String username,String password);
}
