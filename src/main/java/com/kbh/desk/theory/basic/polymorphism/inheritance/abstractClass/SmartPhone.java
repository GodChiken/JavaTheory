package com.kbh.desk.theory.basic.polymorphism.inheritance.abstractClass;

public class SmartPhone extends Phone{
    SmartPhone(String owner) {
        super(owner);
    }
    public void internetSearch(){
        System.out.println("인터넷 검색");
    }
}
