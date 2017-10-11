package com.lily.design.hookmethod;

/**
 * Created by Lily on 2017/10/11.
 */
public class TestClient {
    public static void main(String args[]) {
        ConcreteClass1 concreteClass1 = new ConcreteClass1();
        ConcreteClass2 concreteClass2 = new ConcreteClass2();
        concreteClass1.templateMethod();
        concreteClass1.setSay(false);
        concreteClass1.templateMethod();
        concreteClass2.templateMethod();
    }
}
