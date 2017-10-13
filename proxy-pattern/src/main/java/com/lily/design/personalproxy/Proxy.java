package com.lily.design.personalproxy;

/**
 * Created by Lily on 2017/10/13.
 */
public class Proxy implements Subject, IProxy {
    private Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    //代理
    @Override
    public void say() {
        this.subject.say();
    }

    @Override
    public void run() {
        this.subject.run();
    }

    @Override
    public void shopping() {
        this.subject.shopping();
        this.count();
    }

    //增加收费方法
    @Override
    public void count() {
        System.out.println("hehe, 又在烧钱了");
    }
}
