package com.kbh.desk.theory.basic.polymorphism.inheritance.abstractClass;

public class PhoneTest {
    public static void main(String[] args) {
        // Phone phone = new Phone(); ------> error

        Phone phone = new SmartPhone("Kim");
        phone.turnOn();
        phone.turnOff();

        SmartPhone smartPhone = new SmartPhone("Lee");
        smartPhone.turnOn();
        smartPhone.turnOff();
    }
}
