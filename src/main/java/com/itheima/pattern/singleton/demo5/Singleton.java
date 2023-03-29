
package com.itheima.pattern.singleton.demo5;

//懒汉式的静态内部类模式
public class Singleton {
    private Singleton(){}

//    静态内部类
    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }
//    提供一个公用的访问方式
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
