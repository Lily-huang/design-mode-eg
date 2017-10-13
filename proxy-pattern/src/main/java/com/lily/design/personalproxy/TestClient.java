package com.lily.design.personalproxy;

/**
 * Created by Lily on 2017/10/13.
 */
public class TestClient {
    public static void main(String args[]) {
        Subject subject = new RealSubject("Leo");
        Subject proxy = new Proxy(subject);
        proxy.say();
        proxy.run();
        proxy.shopping();
    }
}
