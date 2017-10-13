package com.lily.design.normalproxy;

/**
 * Created by Lily on 2017/10/13.
 */
public class RealSubject implements Subject {
    private String name = "";

    //构造函数限制谁能创建角色，并传递名字
    public RealSubject(Subject subject, String name) throws Exception {
        if (subject == null) {//检查谁能创建真实的角色
            throw new Exception("不能创建真实角色");
        } else {
            this.name = name;
        }
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
