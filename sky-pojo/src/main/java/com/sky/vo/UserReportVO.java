package com.sky.vo;

import java.io.Serializable;

public class UserReportVO implements Serializable {

    //日期，以逗号分隔，例如：2022-10-01,2022-10-02,2022-10-03
    private String dateList;

    //用户总量，以逗号分隔，例如：200,210,220
    private String totalUserList;

    //新增用户，以逗号分隔，例如：20,21,10
    private String newUserList;

    public UserReportVO() {
    }

    public UserReportVO(String dateList, String totalUserList, String newUserList) {
        this.dateList = dateList;
        this.totalUserList = totalUserList;
        this.newUserList = newUserList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getDateList() {
        return dateList;
    }

    public void setDateList(String dateList) {
        this.dateList = dateList;
    }

    public String getTotalUserList() {
        return totalUserList;
    }

    public void setTotalUserList(String totalUserList) {
        this.totalUserList = totalUserList;
    }

    public String getNewUserList() {
        return newUserList;
    }

    public void setNewUserList(String newUserList) {
        this.newUserList = newUserList;
    }

    public static class Builder {
        private String dateList;
        private String totalUserList;
        private String newUserList;

        public Builder dateList(String dateList) {
            this.dateList = dateList;
            return this;
        }

        public Builder totalUserList(String totalUserList) {
            this.totalUserList = totalUserList;
            return this;
        }

        public Builder newUserList(String newUserList) {
            this.newUserList = newUserList;
            return this;
        }

        public UserReportVO build() {
            return new UserReportVO(dateList, totalUserList, newUserList);
        }
    }
}