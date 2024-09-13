package com.huajieyu.pattern.behavior.visitor;

public class Cat implements Animal{

    @Override
    public void accept(Person person) {
        person.feed(this);
    }
}
