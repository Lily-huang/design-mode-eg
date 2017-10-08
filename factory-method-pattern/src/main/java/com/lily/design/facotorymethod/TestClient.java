package com.lily.design.facotorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public class TestClient {
    public static void main(String args[]) {
        Factory factory = new ConcreteFactory();
        Product product1 = factory.createProduct(ConcreteProduct1.class);
        Product product2 = factory.createProduct(ConcreteProduct2.class);
        product1.method1();
        product1.method2();
        product2.method1();
        product2.method2();
    }
}
