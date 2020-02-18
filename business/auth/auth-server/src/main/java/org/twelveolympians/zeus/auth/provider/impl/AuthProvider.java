package org.twelveolympians.zeus.auth.provider.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.twelveolympians.zeus.auth.provider.IAuthProvider;

import javax.servlet.http.HttpServletRequest;

@Service
@Slf4j
public class AuthProvider implements IAuthProvider {
    /**
     * @param authRequest 访问的url,method
     * @return 有权限true, 无权限或全局资源中未找到请求url返回否
     */
    @Override
    public boolean decide(HttpServletRequest authRequest) {
        log.debug("正在访问的url是:{}，method:{}", authRequest.getServletPath(), authRequest.getMethod());
        // TODO 调用资源管理模块
        return true ;
    }
}