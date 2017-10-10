package com.lily.design.facotorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public class TestClient {
    public static void main(String args[]) {
        Factory factory1 = new ConcreteFactory1();
        factory1.method1();
        factory1.method2();

        Factory factory2 = new ConcreteFactory2();
        factory2.method1();
        factory2.method2();

        ConcreteProductA a1 = factory1.createProductA();
        a1.method1();
        a1.method2(factory1.getClass().getSimpleName());

        ConcreteProductA a2 = factory2.createProductA();
        a2.method1();
        a2.method2(factory2.getClass().getSimpleName());

        ConcreteProductB b1 = factory1.createProductB();
        b1.method1();
        b1.method2(factory1.getClass().getSimpleName());

        ConcreteProductB b2 = factory2.createProductB();
        b2.method1();
        b2.method2(factory2.getClass().getSimpleName());
    }
}
