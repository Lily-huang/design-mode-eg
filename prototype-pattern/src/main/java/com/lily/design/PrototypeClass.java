package com.lily.design;

import java.util.ArrayList;

/**
 * Created by Lily on 2017/10/15.
 */
public class PrototypeClass implements Cloneable {
    private ArrayList<String> deep_arrayList = new ArrayList<>();//深拷贝
    private ArrayList<String> shallow_arrayList = new ArrayList<>();//浅拷贝
    private String basic_string = "";//基本类型，此处String也被处理为基本类型（通过stringpool需时创建）

    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
            prototypeClass.deep_arrayList = (ArrayList<String>) this.deep_arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }

    public void setDeepArray(String value) {
        this.deep_arrayList.add(value);
    }

    public void setShallowArray(String value) {
        this.shallow_arrayList.add(value);
    }

    public void setBasicStr(String value) {
        this.basic_string = value;
    }

    public ArrayList<String> getDeepArray() {
        return this.deep_arrayList;
    }

    public ArrayList<String> getShallowArray() {
        return this.shallow_arrayList;
    }

    public String getBasicStr() {
        return this.basic_string;
    }
}
