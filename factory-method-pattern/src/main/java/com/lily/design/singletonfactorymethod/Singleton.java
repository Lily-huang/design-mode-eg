package com.lily.design.singletonfactorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public class Singleton {
    private static String name = "";

    private Singleton() {
    }

    public void setName(String name) {
        if (this.name == "")
            this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void doSomething() {
        System.out.println("get the singleton");
    }
}
