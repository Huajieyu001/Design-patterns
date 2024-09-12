package com.huajieyu.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriptSubject extends Subject{

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notify(String msg) {
        observerList.forEach(e -> {
            e.update(msg);
        });
    }
}
