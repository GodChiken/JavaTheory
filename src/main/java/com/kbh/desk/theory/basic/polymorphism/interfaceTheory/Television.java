package com.kbh.desk.theory.basic.polymorphism.interfaceTheory;

/*
실제로 해보니 컴파일 오류가 나지 않는다.
public abstract class Television implements RemoteControl{
*/
public class Television implements RemoteControl {
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void setVolume(int volume) {

    }
}
