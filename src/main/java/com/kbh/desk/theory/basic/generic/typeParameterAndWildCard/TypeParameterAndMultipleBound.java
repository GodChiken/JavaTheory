package com.kbh.desk.theory.basic.generic.typeParameterAndWildCard;

public class TypeParameterAndMultipleBound {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ));

        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));
    }
    /**
     * Type Parameter Multiple Bounding
     */
    public static <T extends Number & Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }

        if(z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    /**
     * Wild Card 는 Multiple Bounding을 할 수없다.
     */
    /*public static <? extends Number & Comparable<?>> Object maximum(Object x, Object y, Object z){
        Number max = (Number) x;
        if(y.compareTo(max) > 0) {
            max = (Number) y;
        }

        if(z.compareTo(max) > 0) {
            max = (Number) z;
        }
        return max;
    }*/
    /**
     * Not Multiple Bounding - compile error
     * 왜냐하면 T(타입 파라미터)는 Comparable 인터페이스를 포함하지 않았기 떄문이다.
     */
    /*public static <T extends Number> T notMultipleBoundMaximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }

        if(z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }*/
    /**
     * 단순히 extends 에서 super 키워드로 고친 예제
     * 이것으로 타입 파라미터는 하위로 제한을 두는 super keyword를 사용할 수 없다.
     */
    /*public static <T super Number & Comparable<T>> T typeParameterCanNotSuperKeyword(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }

        if(z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }*/
}
