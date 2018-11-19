package com.kbh.desk.theory.advanced.functionalProgramming;

public class AboutPureFunction {
    private static StringBuilder stringBuilder = new StringBuilder().append("Hello");

    public static void main(String[] args) {
        System.out.println(pureFunction("Hello"));
        System.out.println(pureFunction("Hello"));
        System.out.println(nonPureFunction(" Java"));
        System.out.println(nonPureFunction(" Java"));
    }

    private static String pureFunction(String text) {
        return text + " Java";
    }

    private static String nonPureFunction(String text) {
        return stringBuilder.append(text).toString();
    }
}
