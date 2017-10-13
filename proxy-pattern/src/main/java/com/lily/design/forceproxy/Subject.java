package com.lily.design.forceproxy;

/**
 * Created by Lily on 2017/10/13.
 */
public interface Subject {
    public void say();

    public void run();

    public void shopping();

    //寻找自己的代理
    public Subject getProxy();
}
