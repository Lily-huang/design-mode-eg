package com.lily.design.eg;

/**
 * Created by Lily on 2017/10/12.
 */
public abstract class Product {
    protected String words = "";

    protected abstract void say();

    final public void sayHello() {
        if (!this.words.equals("")) {
            say();
        } else {
            System.out.println("said nothing");
        }
    }

    final public void setSay(String words) {
        this.words = words;
    }
}
