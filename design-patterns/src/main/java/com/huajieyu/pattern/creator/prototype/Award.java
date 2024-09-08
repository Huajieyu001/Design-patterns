package com.huajieyu.pattern.creator.prototype;

public class Award implements Cloneable{

    private String name;

    private int level;

    private String university;

    public Award(String name, int level, String university) {
        this.name = name;
        this.level = level;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public Award clone() throws CloneNotSupportedException {
        return (Award) super.clone();
    }

    @Override
    public String toString() {
        return "Award{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", university='" + university + '\'' +
                '}';
    }
}
