package com.lily.design.dynamicproxy;

/**
 * Created by Lily on 2017/10/13.
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("BeforeAdvice 前置通知，被执行了");
    }
}
