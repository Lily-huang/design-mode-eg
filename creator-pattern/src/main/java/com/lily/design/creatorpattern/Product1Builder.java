package com.lily.design.creatorpattern;

import java.util.ArrayList;

/**
 * Created by Lily on 2017/10/12.
 */
public class Product1Builder extends Builder {
    private ConcreteProduct1 concreteProduct1 = new ConcreteProduct1();


    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.concreteProduct1.setSequence(sequence);
    }

    @Override
    public Product getProduct() {
        return this.concreteProduct1;
    }
}
