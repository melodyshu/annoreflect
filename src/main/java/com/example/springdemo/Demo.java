package com.example.springdemo;

@Anndemo(tableName = "xxx")
public class Demo implements IDemo,IDemo2{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
