package com.lily.design.proxypattern;

import java.util.PrimitiveIterator;

/**
 * Created by Lily on 2017/10/13.
 */
public class Proxy implements Subject {
    //要代理哪个实现类
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
    }
}
