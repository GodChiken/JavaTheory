package com.kbh.desk.theory.basic.polymorphism.inheritance.basic;

public class Child extends Parent{
    private String hobby;

    Child(String name, int age, String hobby){
        super(name, age);
        this.hobby = hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }
}
