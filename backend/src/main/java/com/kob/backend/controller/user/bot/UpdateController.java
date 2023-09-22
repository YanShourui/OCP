package com.kob.backend.controller.user.bot;

import com.kob.backend.service.user.bot.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * ClassName: UpdateController
 * Package: com.kob.backend.controller.user.bot
 * Description:
 *
 * @Author: 闫守瑞
 * @Create: 2023/9/21 - 17:08
 * @Version: v1.0
 */
@RestController
public class UpdateController {
    @Autowired
    private UpdateService updateService;

    @PostMapping("/user/bot/update/")
    public Map<String, String> update(@RequestParam Map<String, String> data) {
        return updateService.update(data);
    }
}
