package org.twelveolympians.zeus.auth.provider.impl;

import lombok.extern.slf4j.Slf4j;
import org.twelveolympians.zeus.auth.entity.po.User;
import org.twelveolympians.zeus.auth.provider.IUserProvider;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserProvider implements IUserProvider {
    @Override
    public User getByUniqueId(String uniqueId) {
        log.info("#### uniqueId:" + uniqueId) ;
        User user = new User() ;
        user.setName("管理员");
        user.setMobile("13888888888");
        user.setUsername("admin");
        user.setPassword("$2a$10$vYA9wKn/hVGOtwQw2eHiceeIGNBdfLYpDmbzHgBSVmOfHXPH4iYdS");
        user.setEnabled(true);
        user.setAccountNonExpired(true);
        user.setCredentialsNonExpired(true);
        user.setAccountNonLocked(true);
        return user ; // organizationProvider.getUserByUniqueId(uniqueId).getData();
    }
}
