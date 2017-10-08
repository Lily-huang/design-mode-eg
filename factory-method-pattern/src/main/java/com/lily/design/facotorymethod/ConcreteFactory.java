package com.lily.design.facotorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (T) product;
    }
}
