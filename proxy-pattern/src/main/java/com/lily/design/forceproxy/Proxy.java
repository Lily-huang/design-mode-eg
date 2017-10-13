package com.lily.design.forceproxy;

/**
 * Created by Lily on 2017/10/13.
 */
public class Proxy implements Subject {
    private Subject subject = null;

    //通过构造函数传递要对谁进行代理
    public Proxy(Subject subject) {
        this.subject = subject;
        Subject i = this.subject;
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
    }

    @Override
    public Subject getProxy() {
        return this;
    }
}
