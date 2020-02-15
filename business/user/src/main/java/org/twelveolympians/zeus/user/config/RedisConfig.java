package org.twelveolympians.zeus.user.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.twelveolympians.zeus.common.web.redis.BaseRedisConfig;

@Configuration
@EnableCaching
public class RedisConfig extends BaseRedisConfig {

}