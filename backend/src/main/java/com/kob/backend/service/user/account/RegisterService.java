package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * ClassName: RegisterService
 * Package: com.kob.backend.service.user.account
 * Description:
 *
 * @Author: 闫守瑞
 * @Create: 2023/9/19 - 8:55
 * @Version: v1.0
 */
public interface RegisterService {
    public Map<String, String> register(String username, String password,String confirmedPassword);
}
