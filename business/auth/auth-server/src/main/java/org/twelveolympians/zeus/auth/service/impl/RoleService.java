package org.twelveolympians.zeus.auth.service.impl;

import org.twelveolympians.zeus.auth.entity.po.Role;
import org.twelveolympians.zeus.auth.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RoleService implements IRoleService {

    @Override
    public Set<Role> queryUserRolesByUserId(String userId) {
        Role adminRole = new Role() ;
        adminRole.setCode("101") ;
        adminRole.setName("USER");
        adminRole.setDescription("USER");

        Role userRole = new Role() ;
        userRole.setCode("102") ;
        userRole.setName("ADMIN");
        userRole.setDescription("ADMIN");

        Set<Role> set = new HashSet<>() ;
        set.add(adminRole) ;
        set.add(userRole) ;
        return set; //organizationProvider.queryRolesByUserId(userId).getData();
    }

}
