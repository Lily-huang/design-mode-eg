package com.lily.pattern;

/**
 * Created by Lily on 2017/10/29.
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
