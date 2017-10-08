package com.lily.design.postponefactorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public abstract class Product {
    public void method1() {
        System.out.println("get the father Product");
    }

    public abstract void method2();

    public static <T extends Product> T createProduct(String type) {
        try {
            return (T) Class.forName(type).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) new ConcreteProduct1();
    }
}