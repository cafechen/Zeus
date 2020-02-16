package org.twelveolympians.zeus.account.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.twelveolympians.zeus.common.web.redis.BaseRedisConfig;

@Configuration
@EnableCaching
public class RedisConfig extends BaseRedisConfig {

}