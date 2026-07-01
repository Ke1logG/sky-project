package com.sky.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.jwt")
public class JwtProperties {

    private String adminSecretKey;
    private long adminTtl;
    private String adminTokenName;

    private String userSecretKey;
    private long userTtl;
    private String userTokenName;

    public JwtProperties() {}

    // Getter 方法
    public String getAdminSecretKey() { return adminSecretKey; }
    public long getAdminTtl() { return adminTtl; }
    public String getAdminTokenName() { return adminTokenName; }
    public String getUserSecretKey() { return userSecretKey; }
    public long getUserTtl() { return userTtl; }
    public String getUserTokenName() { return userTokenName; }

    // Setter 方法
    public void setAdminSecretKey(String adminSecretKey) { this.adminSecretKey = adminSecretKey; }
    public void setAdminTtl(long adminTtl) { this.adminTtl = adminTtl; }
    public void setAdminTokenName(String adminTokenName) { this.adminTokenName = adminTokenName; }
    public void setUserSecretKey(String userSecretKey) { this.userSecretKey = userSecretKey; }
    public void setUserTtl(long userTtl) { this.userTtl = userTtl; }
    public void setUserTokenName(String userTokenName) { this.userTokenName = userTokenName; }
}