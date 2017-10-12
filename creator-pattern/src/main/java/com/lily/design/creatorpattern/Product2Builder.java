package com.lily.design.creatorpattern;

/**
 * Created by Lily on 2017/10/12.
 */
public class Product2Builder extends Builder {
    private ConcreteProduct2 concreteProduct2 = new ConcreteProduct2();

    @Override
    public void setSay(String words) {
        concreteProduct2.setSay(words);
    }

    @Override
    public Product getProduct() {
        return this.concreteProduct2;
    }
}
