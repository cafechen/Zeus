package org.twelveolympians.zeus.auth.provider;

import org.twelveolympians.zeus.auth.entity.po.Role;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public interface IRoleProvider {

    Set<Role> queryUserRolesByUserId(String userId);

}
