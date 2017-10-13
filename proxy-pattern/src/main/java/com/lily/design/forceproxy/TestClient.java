package com.lily.design.forceproxy;

/**
 * Created by Lily on 2017/10/13.
 */
public class TestClient {
    public static void main(String args[]) {
        System.out.println("****直接访问真实角色****");
        Subject subject1 = new RealSubject("Leo");
        subject1.say();
        subject1.run();
        subject1.shopping();
        System.out.println("****直接访问代理类****");
        Subject subject2 = new RealSubject("Leo");
        Subject proxy = new Proxy(subject2);
        proxy.say();
        proxy.run();
        proxy.shopping();
        System.out.println("****强制代理场景****");
        Subject subject3 = new RealSubject("Leo");
        Subject proxy1 = subject3.getProxy();
        proxy1.say();
        proxy1.run();
        proxy1.shopping();
    }
}
