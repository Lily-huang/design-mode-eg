package com.lily.design.facotorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public class ConcreteFactory2 extends Factory {
    @Override
    public void method2() {
        System.out.println("get the child Factory 2");
    }

    @Override
    public ConcreteProductA createProductA() {
        return new ConcreteProductA();
    }

    @Override
    public ConcreteProductB createProductB() {
        return new ConcreteProductB();
    }
}
