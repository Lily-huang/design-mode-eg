package com.lily.design.facotorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public class ConcreteProductA extends Product {
    @Override
    public void method2(String rank) {
        System.out.println("get the child Product A - " + rank);
    }
}
