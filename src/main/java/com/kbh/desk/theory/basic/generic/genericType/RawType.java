package com.kbh.desk.theory.basic.generic.genericType;

import java.util.Arrays;
import java.util.List;

public class RawType<T> {
    public List<String> getStrs() {
        return Arrays.asList("str");
    }
    public static void main(String[] args) {
        RawType t = new RawType();
        /*for (String str : t.getStrs()) {
            System.out.println(str);
        }*/
    }
}
