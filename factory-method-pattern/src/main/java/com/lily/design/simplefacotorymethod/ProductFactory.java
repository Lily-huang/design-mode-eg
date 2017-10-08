package com.lily.design.simplefacotorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public class ProductFactory {
    public static <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            System.out.print("clazz not found");
        }
        return (T) product;
    }
}
