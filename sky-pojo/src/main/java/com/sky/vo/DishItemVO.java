package com.sky.vo;

import java.io.Serializable;

public class DishItemVO implements Serializable {

    //菜品名称
    private String name;

    //份数
    private Integer copies;

    //菜品图片
    private String image;

    //菜品描述
    private String description;

    public DishItemVO() {
    }

    public DishItemVO(String name, Integer copies, String image, String description) {
        this.name = name;
        this.copies = copies;
        this.image = image;
        this.description = description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class Builder {
        private String name;
        private Integer copies;
        private String image;
        private String description;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder copies(Integer copies) {
            this.copies = copies;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public DishItemVO build() {
            return new DishItemVO(name, copies, image, description);
        }
    }
}