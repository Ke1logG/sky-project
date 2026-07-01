package com.sky.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String username;
    private String name;
    private String password;
    private String phone;
    private String sex;
    private String idNumber;
    private Integer status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Long createUser;
    private Long updateUser;

    // 无参构造函数
    public Employee() {}

    // 全参构造函数
    public Employee(Long id, String username, String name, String password, String phone, String sex, String idNumber, Integer status, LocalDateTime createTime, LocalDateTime updateTime, Long createUser, Long updateUser) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.sex = sex;
        this.idNumber = idNumber;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createUser = createUser;
        this.updateUser = updateUser;
    }

    // Getter 方法
    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getName() { return name; }
    public String getPassword() { return password; }
    public String getPhone() { return phone; }
    public String getSex() { return sex; }
    public String getIdNumber() { return idNumber; }
    public Integer getStatus() { return status; }
    public LocalDateTime getCreateTime() { return createTime; }
    public LocalDateTime getUpdateTime() { return updateTime; }
    public Long getCreateUser() { return createUser; }
    public Long getUpdateUser() { return updateUser; }

    // Setter 方法
    public void setId(Long id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setName(String name) { this.name = name; }
    public void setPassword(String password) { this.password = password; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setSex(String sex) { this.sex = sex; }
    public void setIdNumber(String idNumber) { this.idNumber = idNumber; }
    public void setStatus(Integer status) { this.status = status; }
    public void setCreateTime(LocalDateTime createTime) { this.createTime = createTime; }
    public void setUpdateTime(LocalDateTime updateTime) { this.updateTime = updateTime; }
    public void setCreateUser(Long createUser) { this.createUser = createUser; }
    public void setUpdateUser(Long updateUser) { this.updateUser = updateUser; }

    // Builder 方法
    public static EmployeeBuilder builder() { return new EmployeeBuilder(); }

    public static class EmployeeBuilder {
        private Long id;
        private String username;
        private String name;
        private String password;
        private String phone;
        private String sex;
        private String idNumber;
        private Integer status;
        private LocalDateTime createTime;
        private LocalDateTime updateTime;
        private Long createUser;
        private Long updateUser;

        public EmployeeBuilder id(Long id) { this.id = id; return this; }
        public EmployeeBuilder username(String username) { this.username = username; return this; }
        public EmployeeBuilder name(String name) { this.name = name; return this; }
        public EmployeeBuilder password(String password) { this.password = password; return this; }
        public EmployeeBuilder phone(String phone) { this.phone = phone; return this; }
        public EmployeeBuilder sex(String sex) { this.sex = sex; return this; }
        public EmployeeBuilder idNumber(String idNumber) { this.idNumber = idNumber; return this; }
        public EmployeeBuilder status(Integer status) { this.status = status; return this; }
        public EmployeeBuilder createTime(LocalDateTime createTime) { this.createTime = createTime; return this; }
        public EmployeeBuilder updateTime(LocalDateTime updateTime) { this.updateTime = updateTime; return this; }
        public EmployeeBuilder createUser(Long createUser) { this.createUser = createUser; return this; }
        public EmployeeBuilder updateUser(Long updateUser) { this.updateUser = updateUser; return this; }

        public Employee build() {
            return new Employee(id, username, name, password, phone, sex, idNumber, status, createTime, updateTime, createUser, updateUser);
        }
    }
}