package com.sky.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "员工登录返回的数据格式")
public class EmployeeLoginVO implements Serializable {

    @ApiModelProperty("主键值")
    private Long id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("jwt令牌")
    private String token;

    public EmployeeLoginVO() {}

    public EmployeeLoginVO(Long id, String userName, String name, String token) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.token = token;
    }

    public Long getId() { return id; }
    public String getUserName() { return userName; }
    public String getName() { return name; }
    public String getToken() { return token; }

    public void setId(Long id) { this.id = id; }
    public void setUserName(String userName) { this.userName = userName; }
    public void setName(String name) { this.name = name; }
    public void setToken(String token) { this.token = token; }

    // Builder 方法
    public static EmployeeLoginVOBuilder builder() { return new EmployeeLoginVOBuilder(); }

    public static class EmployeeLoginVOBuilder {
        private Long id;
        private String userName;
        private String name;
        private String token;

        public EmployeeLoginVOBuilder id(Long id) { this.id = id; return this; }
        public EmployeeLoginVOBuilder userName(String userName) { this.userName = userName; return this; }
        public EmployeeLoginVOBuilder name(String name) { this.name = name; return this; }
        public EmployeeLoginVOBuilder token(String token) { this.token = token; return this; }

        public EmployeeLoginVO build() {
            return new EmployeeLoginVO(id, userName, name, token);
        }
    }
}