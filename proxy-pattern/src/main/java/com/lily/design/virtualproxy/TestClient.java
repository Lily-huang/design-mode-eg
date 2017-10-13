package com.lily.design.virtualproxy;

/**
 * Created by Lily on 2017/10/13.
 */
public class TestClient {
    public static void main(String args[]) {
        Subject subject = null;
        //延迟至代理调用方法处判断是否需要进行初始化
        Subject proxy = new Proxy(subject);
        proxy.say();
        proxy.run();
        proxy.shopping();
    }
}
