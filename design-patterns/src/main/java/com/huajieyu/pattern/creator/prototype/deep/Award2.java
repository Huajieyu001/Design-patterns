package com.huajieyu.pattern.creator.prototype.deep;

import com.huajieyu.pattern.creator.prototype.Student;

import java.io.Serializable;

/**
 * 用于测试浅克隆
 */
public class Award2 implements Cloneable, Serializable {

    private Student student;

    private int level;

    private String university;

    public Award2(Student student, int level, String university) {
        this.student = student;
        this.level = level;
        this.university = university;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public Award2 clone() throws CloneNotSupportedException {
        return (Award2) super.clone();
    }

    @Override
    public String toString() {
        return "Award{" +
                "student='" + student + '\'' +
                ", level=" + level +
                ", university='" + university + '\'' +
                '}';
    }
}
