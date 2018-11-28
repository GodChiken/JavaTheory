package com.kbh.desk.theory.basic.polymorphism.interfaceTheory;

/**

 Compile 이후 이렇게 된다는데 확인해봐야한다.

 public static final int MAX_VOLUME = 10;
 public static final int MIN_VOLUME = 0;

 public abstract void turnOn();
 public abstract void turnOff();
 public abstract void setVolume(int volume);

 public default void setMute(boolean mute){
 if(mute) {
 System.out.println("음소거");
 }
 else {
 System.out.println("음소거 해제");
 }
 }

 public static void changeBattery(){
 System.out.println("배터리 교체");
 }
 */
public interface RemoteControl {

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute) {
            System.out.println("음소거");
        }
        else {
            System.out.println("음소거 해제");
        }
    }

    static void changeBattery(){
        System.out.println("배터리 교체");
    }
}