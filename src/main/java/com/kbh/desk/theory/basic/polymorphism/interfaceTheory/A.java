package com.kbh.desk.theory.basic.polymorphism.interfaceTheory;

public class A implements DefaultInterface {
    @Override
    public void method1() {
        System.out.println("추상 메서드는 어짜피 반드시 구현해야한다.");
    }
}
