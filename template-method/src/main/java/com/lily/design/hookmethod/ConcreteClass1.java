package com.lily.design.hookmethod;

/**
 * Created by Lily on 2017/10/11.
 */
public class ConcreteClass1 extends AbstractClass {
    private boolean sayFlag = true;

    @Override
    protected void doSomething() {
        System.out.println("ConcreteClass1 is doing something");
    }

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClass1 is doing anything");
    }

    @Override
    protected void say() {
        System.out.println("ConcreteClass1 said hello");
    }

    protected boolean isSay() {
        return this.sayFlag;
    }

    public void setSay(boolean isSay) {
        this.sayFlag = isSay; //此类是否说hello由外部条件决定
    }
}
