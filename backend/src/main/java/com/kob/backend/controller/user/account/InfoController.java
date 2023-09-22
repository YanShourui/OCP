package com.kob.backend.controller.user.account;

import com.kob.backend.service.user.account.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * ClassName: InfoController
 * Package: com.kob.backend.controller.user.account
 * Description:
 *
 * @Author: 闫守瑞
 * @Create: 2023/9/19 - 11:14
 * @Version: v1.0
 */
@RestController
public class InfoController {
    @Autowired
    private InfoService infoService;

    @GetMapping("/user/account/info/")
    public Map<String, String> getinfo() {
        return infoService.getinfo();
    }

}
