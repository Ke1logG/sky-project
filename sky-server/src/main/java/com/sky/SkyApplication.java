package com.sky;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@EnableScheduling
public class SkyApplication {
    private static final Logger log = LoggerFactory.getLogger(SkyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SkyApplication.class, args);
        log.info("start success");
    }
}