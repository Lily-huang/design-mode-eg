package com.lily.design.creatorpattern;

/**
 * Created by Lily on 2017/10/12.
 */
public class ConcreteProduct1 extends Product {
    @Override
    protected void start() {
        System.out.println("ConcreteProduct1 started");
    }

    @Override
    protected void say() {
        System.out.println("ConcreteProduct1 said");
    }

    @Override
    protected void cry() {
        System.out.println("ConcreteProduct1 cried");
    }

    @Override
    protected void smile() {
        System.out.println("ConcreteProduct1 smiled");
    }

    @Override
    protected void stop() {
        System.out.println("ConcreteProduct1 stopped");
    }
}
