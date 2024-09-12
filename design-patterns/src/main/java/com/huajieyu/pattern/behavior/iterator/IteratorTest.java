package com.huajieyu.pattern.behavior.iterator;

import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    public void test(){
        StudentAggregate aggregate = new StudentAggregateImpl();

        aggregate.addStudent(new Student("Tom", 24));
        aggregate.addStudent(new Student("Rosy", 21));
        aggregate.addStudent(new Student("Jack", 29));
        aggregate.addStudent(new Student("John", 32));
        aggregate.addStudent(new Student("Seek", 14));

        StudentIterator studentIterator = aggregate.getStudentIterator();

        while(studentIterator.hasNext()){
            Student next = studentIterator.next();
            System.out.println(next.toString());
        }
    }
}
