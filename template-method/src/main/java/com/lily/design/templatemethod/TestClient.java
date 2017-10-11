package com.lily.design.templatemethod;

/**
 * Created by Lily on 2017/10/11.
 */
public class TestClient {
    public static void main(String args[]) {
        AbstractClass abstractClass1 = new ConcreteClass1();
        AbstractClass abstractClass2 = new ConcreteClass2();
        abstractClass1.templateMethod();
        abstractClass2.templateMethod();
    }
}
