package com.lily.design.facotorymethod;

/**
 * Created by Lily on 2017/10/8.
 */
public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
