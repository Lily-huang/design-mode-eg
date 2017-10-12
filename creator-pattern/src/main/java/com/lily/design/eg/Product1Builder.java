package com.lily.design.eg;

/**
 * Created by Lily on 2017/10/12.
 */
public class Product1Builder extends Builder {
    private ConcreteProduct1 concreteProduct1 = new ConcreteProduct1();

    @Override
    public void setSay(String words) {
        concreteProduct1.setSay(words);
    }

    @Override
    public Product getProduct() {
        return this.concreteProduct1;
    }
}
