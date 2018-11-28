package com.kbh.desk.theory.basic.polymorphism.interfaceTheory;

public class PersonalRemoteControl {
    private RemoteControl remoteControl = new Television();

    PersonalRemoteControl(RemoteControl remoteControl){
        this.remoteControl = remoteControl;
    }

    void changeAudioControl(){
        RemoteControl rc = new Audio();
    }
}
