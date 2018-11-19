package com.kbh.desk.theory.basic.polymorphism.inheritance.abstractClass;

public abstract class Phone {
    private String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void turnOn(){
        System.out.println("폰 전원을 킵니다.");
    }

    public void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }
}
