package com.sky.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DataOverViewQueryDTO implements Serializable {

    private LocalDateTime begin;

    private LocalDateTime end;

    public DataOverViewQueryDTO() {
    }

    public DataOverViewQueryDTO(LocalDateTime begin, LocalDateTime end) {
        this.begin = begin;
        this.end = end;
    }

    public static Builder builder() {
        return new Builder();
    }

    public LocalDateTime getBegin() {
        return begin;
    }

    public void setBegin(LocalDateTime begin) {
        this.begin = begin;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public static class Builder {
        private LocalDateTime begin;
        private LocalDateTime end;

        public Builder begin(LocalDateTime begin) {
            this.begin = begin;
            return this;
        }

        public Builder end(LocalDateTime end) {
            this.end = end;
            return this;
        }

        public DataOverViewQueryDTO build() {
            return new DataOverViewQueryDTO(begin, end);
        }
    }
}