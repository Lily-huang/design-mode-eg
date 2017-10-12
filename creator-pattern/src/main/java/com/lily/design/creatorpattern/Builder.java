package com.lily.design.creatorpattern;

import java.util.ArrayList;

/**
 * Created by Lily on 2017/10/12.
 */
public abstract class Builder {
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract Product getProduct();
}
