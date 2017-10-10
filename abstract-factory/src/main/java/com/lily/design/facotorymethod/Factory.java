package com.lily.design.facotorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public abstract class Factory {
    public void method1() {
        System.out.println("get the father Factory");
    }

    public abstract void method2();

    public abstract ConcreteProductA createProductA();

    public abstract ConcreteProductB createProductB();
}
