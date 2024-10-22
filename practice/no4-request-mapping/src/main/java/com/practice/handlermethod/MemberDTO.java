package com.practice.handlermethod;

public class MemberDTO {

    private String name;
    private int age;
    private int groupCode;

    public MemberDTO() {}


    public MemberDTO(String name, int age, int groupCode) {
        this.name = name;
        this.age = age;
        this.groupCode = groupCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getgroupCode() {
        return groupCode;
    }

    public void setgroupCode(int groupCode) {
        this.groupCode = groupCode;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groupCode=" + groupCode +
                '}';
    }
}


