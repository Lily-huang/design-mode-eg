package com.lily.design.hungry;

/**
 * Created by Lily on 2017/10/6.
 */
public class HungryTest {
    public static void main(String args[]) {
        HungrySingleton hungrySingleton = HungrySingleton.getHungrySingleton();
        hungrySingleton.doSomething("hello hungry singleton");
    }
}
