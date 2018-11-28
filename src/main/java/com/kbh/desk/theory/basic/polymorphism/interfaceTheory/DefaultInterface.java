package com.kbh.desk.theory.basic.polymorphism.interfaceTheory;

public interface DefaultInterface {
    void method1();
    default void method2(){
        System.out.println("디폴트 메서드");
    }
    interface ASDF {

    }
}
