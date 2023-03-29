package com.itheima.pattern.singleton.demo1;

//饿汉式的静态成员变量
public class Singleton {
    private Singleton(){}
//    在本类中创建本类对象
    private static Singleton instance=new Singleton();
//    提供一个公用的访问方式
    public static Singleton getInstance(){
        return instance;
    }
}
