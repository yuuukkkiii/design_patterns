package com.itheima.pattern.singleton.demo3;

//懒汉式的线程不安全模式
public class Singleton {
    private Singleton(){}
//    在本类中声明本类对象
    private static Singleton instance;
//    提供一个公用的访问方式

//    synchronized实现线程安全
    public static synchronized Singleton getInstance(){
//        判断instance是否为null，如果为null，说明还没有创建
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
