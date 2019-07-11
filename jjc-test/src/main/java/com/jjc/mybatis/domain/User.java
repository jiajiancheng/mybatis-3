package com.jjc.mybatis.domain;

import com.jjc.mybatis.core.SexEnum;

public class User {

    private Integer id;
    private String name;
    private SexEnum sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
