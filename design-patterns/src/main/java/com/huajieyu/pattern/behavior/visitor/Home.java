package com.huajieyu.pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class Home {

    List<Animal> animals = new ArrayList<>();

    public void action(Person person){
        animals.forEach(e -> {
            e.accept(person);
        });
    }

    public void add(Animal animal){
        animals.add(animal);
    }
}
