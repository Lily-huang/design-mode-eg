package com.lily.pattern;

/**
 * Created by Lily on 2017/10/29.
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        System.out.println("ConcreteMediator do thing 1");
        super.concreteColleague1.selfMethod1();
        super.concreteColleague2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        System.out.println("ConcreteMediator do thing 2");
        super.concreteColleague1.selfMethod1();
        super.concreteColleague2.selfMethod2();
    }
}
