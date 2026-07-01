package com.sky.entity;

import java.io.Serializable;

/**
 * 地址簿
 */
public class AddressBook implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    //用户id
    private Long userId;

    //收货人
    private String consignee;

    //手机号
    private String phone;

    //性别 0 女 1 男
    private String sex;

    //省级区划编号
    private String provinceCode;

    //省级名称
    private String provinceName;

    //市级区划编号
    private String cityCode;

    //市级名称
    private String cityName;

    //区级区划编号
    private String districtCode;

    //区级名称
    private String districtName;

    //详细地址
    private String detail;

    //标签
    private String label;

    //是否默认 0否 1是
    private Integer isDefault;

    public AddressBook() {
    }

    public AddressBook(Long id, Long userId, String consignee, String phone, String sex, String provinceCode, String provinceName, String cityCode, String cityName, String districtCode, String districtName, String detail, String label, Integer isDefault) {
        this.id = id;
        this.userId = userId;
        this.consignee = consignee;
        this.phone = phone;
        this.sex = sex;
        this.provinceCode = provinceCode;
        this.provinceName = provinceName;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.districtCode = districtCode;
        this.districtName = districtName;
        this.detail = detail;
        this.label = label;
        this.isDefault = isDefault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public static class Builder {
        private Long id;
        private Long userId;
        private String consignee;
        private String phone;
        private String sex;
        private String provinceCode;
        private String provinceName;
        private String cityCode;
        private String cityName;
        private String districtCode;
        private String districtName;
        private String detail;
        private String label;
        private Integer isDefault;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder consignee(String consignee) {
            this.consignee = consignee;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder provinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }

        public Builder provinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }

        public Builder cityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }

        public Builder cityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public Builder districtCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }

        public Builder districtName(String districtName) {
            this.districtName = districtName;
            return this;
        }

        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder isDefault(Integer isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public AddressBook build() {
            return new AddressBook(id, userId, consignee, phone, sex, provinceCode, provinceName, cityCode, cityName, districtCode, districtName, detail, label, isDefault);
        }
    }
}