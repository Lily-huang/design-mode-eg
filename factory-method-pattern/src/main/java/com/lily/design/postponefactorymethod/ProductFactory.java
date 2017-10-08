package com.lily.design.postponefactorymethod;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lily on 2017/10/8.
 */
public class ProductFactory {
    private static final Map<String, Product> prodMap = new HashMap<>();

    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        if (prodMap.containsKey(type)) {
            System.out.println("get existed class");
            product = prodMap.get(type);
        } else {
            product = Product.createProduct(type);
            prodMap.put(type, product);
            System.out.println("get new class and saved");
        }
        return product;
    }
}
