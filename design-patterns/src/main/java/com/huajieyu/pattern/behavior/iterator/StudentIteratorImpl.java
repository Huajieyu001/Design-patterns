package com.huajieyu.pattern.behavior.iterator;


import java.util.ArrayList;
import java.util.List;

public class StudentIteratorImpl implements StudentIterator{

    private List<Student> studentList;

    private int position = 0;

    public StudentIteratorImpl() {
        this.studentList = new ArrayList<>();
    }

    public StudentIteratorImpl(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.studentList.size();
    }

    @Override
    public Student next() {
        return this.studentList.get(this.position++);
    }
}
