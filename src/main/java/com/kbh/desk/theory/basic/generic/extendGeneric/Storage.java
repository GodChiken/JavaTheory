package com.kbh.desk.theory.basic.generic.extendGeneric;

public interface Storage<T> {
    public void add(T item, int index);
    public T get(int index);
}
