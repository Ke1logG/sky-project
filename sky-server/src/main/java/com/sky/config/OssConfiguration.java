package com.sky.config;

import org.springframework.context.annotation.Configuration;
import com.sky.utils.AliOssUtil;
import com.sky.properties.AliOssProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

@Configuration
public class OssConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public AliOssUtil aliOssUtil(AliOssProperties aliossProperties) {
        return new AliOssUtil(aliossProperties.getEndpoint(), aliossProperties.getAccessKeyId(), aliossProperties.getAccessKeySecret(), aliossProperties.getBucketName());
    }
}
