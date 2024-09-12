package com.huajieyu.pattern.behavior.observer;

import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void test(){
        Subject subject = new SubscriptSubject();

        Observer Tom = new User("Tom");
        Observer John = new User("John");
        Observer Rosy = new User("Rosy");
        Observer Jack = new User("Jack");
        Observer Kobe = new User("Kobe");
        subject.attach(Tom);
        subject.attach(John);
        subject.attach(Rosy);
        subject.attach(Jack);
        subject.attach(Kobe);

        subject.notify("黑神话可以玩了！");

        subject.detach(Rosy);
        subject.detach(Kobe);

        subject.notify("你们被开除了");

    }
}
