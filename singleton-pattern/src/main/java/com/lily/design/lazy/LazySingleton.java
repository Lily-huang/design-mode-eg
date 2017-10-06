package com.lily.design.lazy;

/**
 * Created by Lily on 2017/10/6.
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getLazySingleton() {
        //或者在方法内对if判断模块加synchronized
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void doSomething(String words) {
        System.out.println(LazySingleton.class.getSimpleName() + " get words:" + words);
    }
}
