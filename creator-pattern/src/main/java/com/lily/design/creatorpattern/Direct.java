package com.lily.design.creatorpattern;

import java.util.ArrayList;

/**
 * Created by Lily on 2017/10/12.
 */
public class Direct {
    private ArrayList<String> sequence = new ArrayList<>();
    private Builder builder1 = new Product1Builder();
    private Builder builder2 = new Product2Builder();
    private Builder builder3 = new Product2Builder();

    public ConcreteProduct1 getProduct1() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("smile");
        this.sequence.add("stop");
        this.builder1.setSequence(this.sequence);
        return (ConcreteProduct1) builder1.getProduct();
    }

    public ConcreteProduct2 getProduct2() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("say");
        this.sequence.add("cry");
        this.sequence.add("stop");
        this.builder2.setSequence(this.sequence);
        return (ConcreteProduct2) this.builder2.getProduct();
    }
}
