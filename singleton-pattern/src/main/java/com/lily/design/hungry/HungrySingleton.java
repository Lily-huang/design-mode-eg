package com.lily.design.hungry;

/**
 * Created by Lily on 2017/10/6.
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }

    public static void doSomething(String words) {
        System.out.println(HungrySingleton.class.getSimpleName() + " get words:" + words);
    }
}
