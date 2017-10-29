package com.lily.pattern;

/**
 * Created by Lily on 2017/10/29.
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2() {
        System.out.println("self method 2");
    }

    public void dependencyMethod2() {
        System.out.println("dependency method 2");
        super.mediator.doSomething2();
    }
}
