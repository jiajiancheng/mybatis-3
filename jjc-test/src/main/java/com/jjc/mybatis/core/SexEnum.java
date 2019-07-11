package com.jjc.mybatis.core;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum  SexEnum {
    MALE(1, "男"),
    FEMALE(0, "女"),

    ;

    private int id;
    private String value;

    SexEnum(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public static SexEnum lookup(int id){
        List<SexEnum> filtered = Stream.of(values()).filter(e -> e.getId() == id).collect(Collectors.toList());
        if (filtered.size() == 0) {
            return null;
        }
        return filtered.get(0);
    }

}
