package com.lily.design.creatorpattern;

import java.util.ArrayList;

/**
 * Created by Lily on 2017/10/12.
 */
public abstract class Product {
    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void say();

    protected abstract void cry();

    protected abstract void smile();

    protected abstract void stop();

    final public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("say")) {
                this.say();
            } else if (actionName.equalsIgnoreCase("cry")) {
                this.cry();
            } else if (actionName.equalsIgnoreCase("smile")) {
                this.smile();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
