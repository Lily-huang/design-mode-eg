package com.lily.design.multiplefacotorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public class Product1AbstractFactory extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }

    public void concreteFactorySay() {
        factorySay();
        System.out.println("get the concrete factory 1");
    }
}
