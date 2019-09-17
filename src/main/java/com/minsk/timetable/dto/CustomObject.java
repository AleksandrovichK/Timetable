package com.minsk.timetable.dto;

public class CustomObject {
    private String name;
    private Integer age;
    //private Long penisLength;

    public CustomObject() {
    }

    public CustomObject(String name, Integer age) {
        this.name = name;
        this.age = age;
        //this.penisLength = penisLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    }
    /*public Long getPenisLength() {
        return penisLength;
    }

    public void setPenisLength(Long penisLength) {
        this.penisLength = penisLength;
    }
}
*/