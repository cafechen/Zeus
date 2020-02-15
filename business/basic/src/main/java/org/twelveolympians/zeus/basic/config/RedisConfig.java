package org.twelveolympians.zeus.basic.config;

import org.twelveolympians.zeus.common.web.redis.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class RedisConfig extends BaseRedisConfig {

}