package com.kob.backend.controller.user.bot;

import com.kob.backend.pojo.Bot;
import com.kob.backend.service.user.bot.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * ClassName: GetListController
 * Package: com.kob.backend.controller.user.bot
 * Description:
 *
 * @Author: 闫守瑞
 * @Create: 2023/9/21 - 17:06
 * @Version: v1.0
 */

@RestController
public class GetListController {
    @Autowired
    private GetListService getListService;

    @GetMapping("/user/bot/getlist/")
    public List<Bot> getList() {
        return getListService.getList();
    }
}
