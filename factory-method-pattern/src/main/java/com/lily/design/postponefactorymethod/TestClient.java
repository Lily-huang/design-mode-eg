package com.lily.design.postponefactorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public class TestClient {
    public static void main(String args[]) {
        try {
            Product product1 = ProductFactory.createProduct("com.lily.design.postponefactorymethod.ConcreteProduct1");
            product1.method1();
            product1.method2();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Product product2 = ProductFactory.createProduct("com.lily.design.postponefactorymethod.ConcreteProduct2");
            product2.method1();
            product2.method2();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Product product3 = ProductFactory.createProduct("com.lily.design.postponefactorymethod.ConcreteProduct1");
            product3.method1();
            product3.method2();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
