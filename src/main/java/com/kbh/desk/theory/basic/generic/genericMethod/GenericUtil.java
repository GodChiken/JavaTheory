package com.kbh.desk.theory.basic.generic.genericMethod;



public class GenericUtil {
    public static <K,V> boolean compare(GenericsPair p1, GenericsPair p2){
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return  keyCompare && valueCompare;
    }
}
