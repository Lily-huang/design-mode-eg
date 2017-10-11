package com.lily.design.hookmethod;

/**
 * Created by Lily on 2017/10/11.
 */
public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething();

    protected abstract void doAnything();

    protected abstract void say();

    //模版方法
    final public void templateMethod() {
        System.out.println("templateMethod called");

        //需要say hello的时候才说
        if (this.isSay()) {
            this.say();
        } else {
            System.out.println("do not say hello");
        }
        this.doSomething();
        this.doAnything();
    }

    //钩子方法，默认子类是要说hello的
    protected boolean isSay() {
        return true;
    }
}
