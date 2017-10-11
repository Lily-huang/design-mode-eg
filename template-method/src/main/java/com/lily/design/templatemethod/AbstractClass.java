package com.lily.design.templatemethod;

/**
 * Created by Lily on 2017/10/11.
 */
public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething();

    protected abstract void doAnything();

    //模版方法
    public void templateMethod() {
        System.out.println("templateMethod called");
        this.doSomething();
        this.doAnything();
    }
}
