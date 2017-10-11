package com.lily.design.templatemethod;

/**
 * Created by Lily on 2017/10/11.
 */
public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("ConcreteClass2 is doing something");
    }

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClass2 is doing anything");
    }
}
