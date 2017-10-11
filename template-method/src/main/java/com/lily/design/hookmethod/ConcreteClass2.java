package com.lily.design.hookmethod;

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

    protected boolean isSay() {
        return false; //此类默认是不说hello的
    }

    @Override
    protected void say() {
        System.out.println("ConcreteClass2 said hello");
    }
}
