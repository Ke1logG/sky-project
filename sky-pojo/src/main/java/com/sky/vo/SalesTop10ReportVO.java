package com.sky.vo;

import java.io.Serializable;

public class SalesTop10ReportVO implements Serializable {

    //商品名称列表，以逗号分隔，例如：鱼香肉丝,宫保鸡丁,水煮鱼
    private String nameList;

    //销量列表，以逗号分隔，例如：260,215,200
    private String numberList;

    public SalesTop10ReportVO() {
    }

    public SalesTop10ReportVO(String nameList, String numberList) {
        this.nameList = nameList;
        this.numberList = numberList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }

    public String getNumberList() {
        return numberList;
    }

    public void setNumberList(String numberList) {
        this.numberList = numberList;
    }

    public static class Builder {
        private String nameList;
        private String numberList;

        public Builder nameList(String nameList) {
            this.nameList = nameList;
            return this;
        }

        public Builder numberList(String numberList) {
            this.numberList = numberList;
            return this;
        }

        public SalesTop10ReportVO build() {
            return new SalesTop10ReportVO(nameList, numberList);
        }
    }
}