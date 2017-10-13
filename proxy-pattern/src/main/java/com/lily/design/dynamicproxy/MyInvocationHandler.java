package com.lily.design.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Lily on 2017/10/13.
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理者
    Class clazz = null;
    //被代理的实例
    Object obj = null;

    //我要代理谁
    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    //调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        //这里可以用来添加一些方法，通过AOP的方式切日志，事务，权限等
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账号登陆");
        }
        return result;
    }
}
