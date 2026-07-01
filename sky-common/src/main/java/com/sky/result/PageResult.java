package com.sky.result;

import java.io.Serializable;
import java.util.List;

/**
 * 封装分页查询结果
 */
public class PageResult implements Serializable {

    private long total;
    private List records;

    public PageResult() {}

    public PageResult(long total, List records) {
        this.total = total;
        this.records = records;
    }

    public long getTotal() { return total; }
    public List getRecords() { return records; }

    public void setTotal(long total) { this.total = total; }
    public void setRecords(List records) { this.records = records; }
}