package com.lily.design.dynamicproxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by Lily on 2017/10/13.
 */
public class TestClient {
    public static void main(String args[]){
        Subject subject=new RealSubject();
        InvocationHandler handler=new MyInvocationHandler(subject);
        Subject proxy=DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
        proxy.say("动态代理的使用");
    }
}
