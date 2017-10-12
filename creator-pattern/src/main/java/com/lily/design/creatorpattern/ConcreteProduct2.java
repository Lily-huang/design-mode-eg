package com.lily.design.creatorpattern;

/**
 * Created by Lily on 2017/10/12.
 */
public class ConcreteProduct2 extends Product {
    @Override
    protected void start() {
        System.out.println("ConcreteProduct2 started");
    }

    @Override
    protected void say() {
        System.out.println("ConcreteProduct2 said");
    }

    @Override
    protected void cry() {
        System.out.println("ConcreteProduct2 cried");
    }

    @Override
    protected void smile() {
        System.out.println("ConcreteProduct2 smiled");
    }

    @Override
    protected void stop() {
        System.out.println("ConcreteProduct2 stopped");
    }
}
