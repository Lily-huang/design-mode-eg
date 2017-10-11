package com.lily.design.templatemethod;

/**
 * Created by Lily on 2017/10/11.
 */
public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("ConcreteClass1 is doing something");
    }

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClass1 is doing anything");
    }
}
