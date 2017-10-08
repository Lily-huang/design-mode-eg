package com.lily.design.singletonfactorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public class TestClient {
    public static void main(String args[]) {
        Singleton singleton = SingletonFactory.getSingleton();
        singleton.setName("test");
        singleton.doSomething();
        System.out.println(singleton.getName());

        Singleton singleton1 = SingletonFactory.getSingleton();
        singleton1.setName("test2");//此处get到同一个对象，新的set name不生效
        singleton1.doSomething();
        System.out.println(singleton1.getName());
    }
}
