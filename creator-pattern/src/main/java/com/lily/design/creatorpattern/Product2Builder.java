package com.lily.design.creatorpattern;

import java.util.ArrayList;

/**
 * Created by Lily on 2017/10/12.
 */
public class Product2Builder extends Builder {
    private ConcreteProduct2 concreteProduct2 = new ConcreteProduct2();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.concreteProduct2.setSequence(sequence);
    }

    @Override
    public Product getProduct() {
        return this.concreteProduct2;
    }
}
