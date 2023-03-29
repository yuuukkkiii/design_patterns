
package com.itheima.pattern.singleton.demo4;

//懒汉式的双重检查锁
public class Singleton {
    private Singleton(){}
//    在本类中声明本类对象
    private static volatile Singleton instance;
//    提供一个公用的访问方式

//    synchronized实现线程安全
    public static Singleton getInstance(){
//        判断instance是否为null，如果为null，说明还没有创建
        if(instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
