package com.kbh.desk.theory.basic.generic.genericMethod;

public class GenericMethodExample {
    public static void main(String[] args) {
        GenericsPair<Integer,String> p1 = new GenericsPair<>(1,"사과");
        GenericsPair<Integer,String> p2 = new GenericsPair<>(1,"사과");

        boolean result1 = GenericUtil.<Integer,String>compare(p1,p2);
        boolean result2 = GenericUtil.compare(p1,p2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
