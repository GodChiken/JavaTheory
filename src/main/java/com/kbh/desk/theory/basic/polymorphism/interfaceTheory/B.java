package com.kbh.desk.theory.basic.polymorphism.interfaceTheory;

public class B implements DefaultInterface {
    @Override
    public void method1() {
        System.out.println("나는 B 클래스로 디폴트 인터페이스의 메서드 오버라이딩");
    }

    @Override
    public void method2() {
        System.out.println("또 오버라이딩 해도 되고 아니여도되고");
    }
}
