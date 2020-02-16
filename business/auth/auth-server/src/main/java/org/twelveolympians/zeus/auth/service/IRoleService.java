package org.twelveolympians.zeus.auth.service;

import org.twelveolympians.zeus.auth.entity.po.Role;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public interface IRoleService {

    Set<Role> queryUserRolesByUserId(String userId);

}
