package com.lily.design.singletonfactorymethod;


import java.lang.reflect.Constructor;

/**
 * Created by Lily on 2017/10/8.
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class clazz = Class.forName(Singleton.class.getName());
            Constructor constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
