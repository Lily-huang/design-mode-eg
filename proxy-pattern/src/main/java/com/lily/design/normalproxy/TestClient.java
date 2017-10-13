package com.lily.design.normalproxy;

/**
 * Created by Lily on 2017/10/13.
 */
public class TestClient {
    public static void main(String args[]) {
        Subject proxy = new Proxy("Leo");
        proxy.say();
        proxy.run();
        proxy.shopping();
    }
}
