package com.lily.design.forceproxy;

/**
 * Created by Lily on 2017/10/13.
 */
public class RealSubject implements Subject {
    private String name = "";
    private Subject proxy = null;

    public RealSubject(String name) {
        this.name = name;
    }

    //校验是否代理访问
    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void say() {
        if (this.isProxy()) {
            System.out.println(this.name + " RealSubject is saying");
        } else {
            System.out.println("请使用指定代理访问");
        }
    }

    @Override
    public void run() {
        if (this.isProxy()) {
            System.out.println(this.name + " RealSubject is running");
        } else {
            System.out.println("请使用指定代理访问");
        }
    }

    @Override
    public void shopping() {
        if (this.isProxy()) {
            System.out.println(this.name + " RealSubject is shopping");
        } else {
            System.out.println("请使用指定代理访问");
        }
    }

    //找到自己的代理
    @Override
    public Subject getProxy() {
        this.proxy = new Proxy(this).getProxy();
        return this.proxy;
    }
}
