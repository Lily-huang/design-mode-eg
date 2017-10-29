package com.lily.pattern;

/**
 * Created by Lily on 2017/10/29.
 */
public class TestClient {
    public static void main(String args[]) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        concreteColleague1.selfMethod1();
        concreteColleague1.dependencyMethod1();
        System.out.println();
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);
        concreteColleague2.selfMethod2();
        concreteColleague2.dependencyMethod2();
    }
}
