package com.kob.backend.controller.user.account;

import com.kob.backend.service.user.account.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: LoginController
 * Package: com.kob.backend.controller.user.account
 * Description:
 *
 * @Author: 闫守瑞
 * @Create: 2023/9/19 - 10:44
 * @Version: v1.0
 */
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/user/account/token/")
    public Map<String, String> getToken(@RequestParam Map<String,String> map) {
        String username=map.get("username");
        String password=map.get("password");
        return loginService.getToken(username,password);
    }
}
