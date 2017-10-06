package com.lily.design.lazy;

/**
 * Created by Lily on 2017/10/6.
 */
public class LazyTest {
    public static void main(String args[]) {
        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        lazySingleton.doSomething("hello lazy singleton");
    }
}
