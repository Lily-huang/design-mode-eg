package com.lily.design.personalproxy;

/**
 * Created by Lily on 2017/10/13.
 */
public class RealSubject implements Subject{
    private String name = "";

    public RealSubject(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println(this.name + " RealSubject is saying");
    }

    @Override
    public void run() {
        System.out.println(this.name + " RealSubject is running");
    }

    @Override
    public void shopping() {
        System.out.println(this.name + " RealSubject is shopping");
    }
}
