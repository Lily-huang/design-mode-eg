package com.lily.design.multiplefacotorymethod;


/**
 * Created by Lily on 2017/10/8.
 */
public abstract class AbstractFactory {
    public void factorySay() {
        System.out.println("get the abstract factory");
    }

    public abstract Product createProduct();
}
