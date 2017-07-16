package com.example.demo;

import javax.persistence.*;

/**
 * Created by DINGSHUO on 2017/7/16.
 */

public class MeasEntity {

    private Long id;


    private String para;

    private String valueStr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getValueStr() {
        return valueStr;
    }

    public void setValueStr(String valueStr) {
        this.valueStr = valueStr;
    }
}
