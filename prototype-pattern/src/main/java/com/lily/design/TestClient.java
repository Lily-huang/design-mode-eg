package com.lily.design;

/**
 * Created by Lily on 2017/10/15.
 */
public class TestClient {
    public static void main(String args[]) {
        PrototypeClass prototypeClass = new PrototypeClass();
        prototypeClass.setDeepArray("a");
        prototypeClass.setShallowArray("b");
        prototypeClass.setBasicStr("c");

        PrototypeClass clone_prototypeClass = prototypeClass.clone();
        clone_prototypeClass.setDeepArray("a1");
        clone_prototypeClass.setShallowArray("b1");
        clone_prototypeClass.setBasicStr("c1");
        System.out.println("origin: " + prototypeClass.getDeepArray() + " <深拷贝> clone: " + clone_prototypeClass.getDeepArray());
        System.out.println("origin: " + prototypeClass.getShallowArray() + " <浅拷贝> clone: " + clone_prototypeClass.getShallowArray());
        System.out.println("origin: " + prototypeClass.getBasicStr() + " <基本类型> clone: " + clone_prototypeClass.getBasicStr());
    }
}
