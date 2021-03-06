package org.twelveolympians.zeus.auth.provider;

import org.twelveolympians.zeus.auth.entity.po.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public interface IUserProvider {

    /**
     * 根据用户唯一标识获取用户信息
     *
     * @param uniqueId
     * @return
     */
    @Cacheable(value = "#id")
    User getByUniqueId(String uniqueId);
}
