package com.lily.design.dynamicproxy.business;

import com.lily.design.dynamicproxy.RealSubject;
import com.lily.design.dynamicproxy.Subject;

/**
 * Created by Lily on 2017/10/13.
 */
public class TestClient {
    public static void main(String args[]){
        Subject subject=new RealSubject();
        Subject proxy=SubjectDynamicProxy.newProxyInstance(subject);
        proxy.say("动态代理的业务使用方式");
    }
}
