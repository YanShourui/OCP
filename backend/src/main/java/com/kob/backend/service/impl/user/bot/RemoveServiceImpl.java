package com.kob.backend.service.impl.user.bot;

import com.kob.backend.mapper.BotMapper;
import com.kob.backend.pojo.Bot;
import com.kob.backend.pojo.User;
import com.kob.backend.service.impl.utils.UserDetailsImpl;
import com.kob.backend.service.user.bot.RemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: RemoveServiceImpl
 * Package: com.kob.backend.service.impl.user.bot
 * Description:
 *
 * @Author: 闫守瑞
 * @Create: 2023/9/21 - 17:01
 * @Version: v1.0
 */
@Service
public class RemoveServiceImpl implements RemoveService {
    @Autowired
    private BotMapper botMapper;

    @Override
    public Map<String, String> remove(Map<String, String> data) {
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();

        int bot_id = Integer.parseInt(data.get("bot_id"));
        Bot bot = botMapper.selectById(bot_id);
        Map<String, String> map = new HashMap<>();

        if (bot == null) {
            map.put("error_message", "不存在或已被删除");
            return map;
        }

        if (!bot.getUserId().equals(user.getId())) {
            map.put("error_message", "没有权限删除");
            return map;
        }

        botMapper.deleteById(bot_id);

        map.put("error_message", "success");
        return map;
    }
}
