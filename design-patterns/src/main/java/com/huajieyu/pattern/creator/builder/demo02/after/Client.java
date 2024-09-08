package com.huajieyu.pattern.creator.builder.demo02.after;

public class Client {
    public static void main(String[] args) {
        //构建Phone对象
        Phone.Builder builder= new Phone.Builder();
        builder.cpu("Intel").screen("Aoc").memory("32G").mainboard("ASUS").;
        Phone phone = new Phone(builder);
        System.out.println(phone);
    }
}