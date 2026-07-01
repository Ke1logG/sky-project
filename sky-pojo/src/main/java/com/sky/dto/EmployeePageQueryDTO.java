package com.sky.dto;

import java.io.Serializable;

public class EmployeePageQueryDTO implements Serializable {

    private String name;
    private int page;
    private int pageSize;

    public EmployeePageQueryDTO() {}

    public EmployeePageQueryDTO(String name, int page, int pageSize) {
        this.name = name;
        this.page = page;
        this.pageSize = pageSize;
    }

    public String getName() { return name; }
    public int getPage() { return page; }
    public int getPageSize() { return pageSize; }

    public void setName(String name) { this.name = name; }
    public void setPage(int page) { this.page = page; }
    public void setPageSize(int pageSize) { this.pageSize = pageSize; }
}