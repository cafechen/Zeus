package org.twelveolympians.zeus.basic;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableMethodCache(basePackages = "org.twelveolympians.zeus")
@EnableCreateCacheAnnotation
public class BasicApplication {
    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
    }
}
