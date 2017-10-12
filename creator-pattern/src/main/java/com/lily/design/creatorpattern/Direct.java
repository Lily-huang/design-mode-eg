package com.lily.design.creatorpattern;

/**
 * Created by Lily on 2017/10/12.
 */
public class Direct {
    private String words = "";
    private Builder builder1 = new Product1Builder();
    private Builder builder2 = new Product2Builder();
    private Builder builder3 = new Product2Builder();

    public ConcreteProduct1 getProduct1() {
        this.words = "";
        this.words = "i am ConcreteProduct1";
        this.builder1.setSay(this.words);
        return (ConcreteProduct1) this.builder1.getProduct();
    }

    public ConcreteProduct2 getProduct2() {
        this.words = "";
        this.words = "i am ConcreteProduct2";
        this.builder2.setSay(this.words);
        return (ConcreteProduct2) this.builder2.getProduct();
    }

    public ConcreteProduct2 getProduct3() {
        this.words = "";
        this.builder3.setSay(this.words);
        return (ConcreteProduct2) this.builder3.getProduct();
    }
}
