package com.lily.design.creatorpattern;

/**
 * Created by Lily on 2017/10/12.
 */
public abstract class Builder {
    public abstract void setSay(String words);

    public abstract Product getProduct();
}
