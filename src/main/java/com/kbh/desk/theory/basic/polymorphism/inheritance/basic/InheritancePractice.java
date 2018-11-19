package com.kbh.desk.theory.basic.polymorphism.inheritance.basic;

import com.kbh.desk.theory.basic.polymorphism.inheritance.basic.Child;
import com.kbh.desk.theory.basic.polymorphism.inheritance.basic.Parent;

public class InheritancePractice {
    public static void main(String[] args) {
        Parent parent = new Parent("kim",30);

        Parent anotherParent = new Child("Park",30,"asdf");
        System.out.println(anotherParent.getName());
        System.out.println(anotherParent.getAge());

        /*Child child = (Child) new Parent("Lee", 28);
        System.out.println(child.getName());
        System.out.println(child.getAge());
        System.out.println(child.getHobby());*/
    }
}
