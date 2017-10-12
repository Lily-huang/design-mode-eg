package com.lily.design.creatorpattern;

/**
 * Created by Lily on 2017/10/12.
 */
public class TestClient {
    public static void main(String args[]) {
        Direct direct = new Direct();
        for (int i = 0; i < 5; i++) {
            direct.getProduct1().run();
        }
        for (int j = 0; j < 6; j++) {
            direct.getProduct2().run();
        }
    }
}
