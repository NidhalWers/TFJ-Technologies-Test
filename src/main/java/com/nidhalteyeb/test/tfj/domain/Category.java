package com.nidhalteyeb.test.tfj.domain;

public class Category {

    private String name;

    private Category(String name) {
        this.name = name;
    }

    public static Category of(String value) {
        return new Category(value);
    }

    public String getName() {
        return name;
    }
}
