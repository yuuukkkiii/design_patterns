package com.itheima.pattern.singleton.demo6;



public class Client {
    public static void main(String[] args) {
        Singleton instance= Singleton.INSTANCE;
        Singleton instance2= Singleton.INSTANCE;

//        判断获取到的两个对象是否是一个
        System.out.println(instance==instance2);

    }
}
