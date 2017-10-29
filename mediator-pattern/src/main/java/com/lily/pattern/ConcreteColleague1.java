package com.lily.pattern;

/**
 * Created by Lily on 2017/10/29.
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        System.out.println("self method 1");
    }

    public void dependencyMethod1() {
        System.out.println("dependency method 1");
        super.mediator.doSomething1();
    }
}
