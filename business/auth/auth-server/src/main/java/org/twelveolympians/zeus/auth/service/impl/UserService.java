package org.twelveolympians.zeus.auth.service.impl;

import org.twelveolympians.zeus.auth.entity.po.User;
import org.twelveolympians.zeus.auth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    public User getByUniqueId(String uniqueId) {
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
