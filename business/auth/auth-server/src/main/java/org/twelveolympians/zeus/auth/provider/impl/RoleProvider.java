package org.twelveolympians.zeus.auth.provider.impl;

import org.twelveolympians.zeus.auth.entity.po.Role;
import org.twelveolympians.zeus.auth.provider.IRoleProvider;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RoleProvider implements IRoleProvider {

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
