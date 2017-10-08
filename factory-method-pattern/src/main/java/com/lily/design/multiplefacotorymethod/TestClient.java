package com.lily.design.multiplefacotorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public class TestClient {
    public static void main(String args[]) {
        Product1AbstractFactory product1AbstractFactory = new Product1AbstractFactory();
        product1AbstractFactory.concreteFactorySay();
        Product product1 = product1AbstractFactory.createProduct();
        product1.method1();
        product1.method2();

        Product2AbstractFactory product2AbstractFactory = new Product2AbstractFactory();
        product2AbstractFactory.concreteFactorySay();
        Product product2 = product2AbstractFactory.createProduct();
        product2.method1();
        product2.method2();
    }
}
