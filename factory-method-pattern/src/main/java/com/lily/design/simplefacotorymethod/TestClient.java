package com.lily.design.simplefacotorymethod;


/**
 * Created by Lily on 2017/10/8.
 */
public class TestClient {
    public static void main(String args[]) {
        Product product1 = ProductFactory.createProduct(ConcreteProduct1.class);
        Product product2 = ProductFactory.createProduct(ConcreteProduct2.class);
        product1.method1();
        product1.method2();
        product2.method1();
        product2.method2();
    }
}
