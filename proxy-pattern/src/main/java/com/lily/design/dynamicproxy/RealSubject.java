package com.lily.design.dynamicproxy;

import com.lily.design.forceproxy.*;

/**
 * Created by Lily on 2017/10/13.
 */
public class RealSubject implements Subject {
    @Override
    public void say(String words) {
        System.out.println("RealSubject said " + words);
    }
}
