package com.lily.design.virtualproxy;

/**
 * Created by Lily on 2017/10/13.
 */
public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    //代理
    @Override
    public void say() {
        if (subject == null) {
            subject = new RealSubject("test");
        }
        this.subject.say();
    }

    @Override
    public void run() {
        if (subject == null) {
            subject = new RealSubject("test");
        }
        this.subject.run();
    }

    @Override
    public void shopping() {
        if (subject == null) {
            subject = new RealSubject("test");
        }
        this.subject.shopping();
    }
}
