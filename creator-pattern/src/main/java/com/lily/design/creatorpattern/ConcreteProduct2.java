package com.lily.design.creatorpattern;

/**
 * Created by Lily on 2017/10/12.
 */
public class ConcreteProduct2 extends Product {
    @Override
    protected void say() {
        System.out.println("ConcreteProduct2 said loudly: " + super.words);
    }
}
