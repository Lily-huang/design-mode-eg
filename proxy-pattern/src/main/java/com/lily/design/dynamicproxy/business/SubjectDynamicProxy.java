package com.lily.design.dynamicproxy.business;

import com.lily.design.dynamicproxy.DynamicProxy;
import com.lily.design.dynamicproxy.MyInvocationHandler;
import com.lily.design.dynamicproxy.Subject;

import java.lang.reflect.InvocationHandler;

/**
 * Created by Lily on 2017/10/13.
 */
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] classes = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }
}
