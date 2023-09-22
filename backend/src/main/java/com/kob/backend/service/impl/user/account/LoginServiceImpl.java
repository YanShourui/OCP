package com.kob.backend.service.impl.user.account;

import com.kob.backend.pojo.User;
import com.kob.backend.service.impl.utils.UserDetailsImpl;
import com.kob.backend.service.user.account.LoginService;
import com.kob.backend.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: LoginServiceImpl
 * Package: com.kob.backend.service.impl.user.account
 * Description:
 *
 * @Author: 闫守瑞
 * @Create: 2023/9/19 - 8:59
 * @Version: v1.0
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Override
    public Map<String, String> getToken(String username, String password) {
        //把用户名和密码封装成一个加密字符串
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);

        UserDetailsImpl loginUser=(UserDetailsImpl) authenticate.getPrincipal();
        User user=loginUser.getUser();

        String jwt = JwtUtil.createJWT(user.getId().toString());
        Map<String, String> map=new HashMap<>();
        //注意：别把m e ssage写成m a ssage
        map.put("error_message", "success");
        map.put("token", jwt);

        return map;
    }
}
