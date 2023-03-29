package com.itheima.pattern.singleton.demo2;

//饿汉式的静态代码块方式
public class Singleton {
    private Singleton(){}
//   声明Singleton类型变量
    private static Singleton instance;
    static {
        instance=new Singleton();
    }
//    提供一个公用的访问方式
    public static Singleton getInstance(){
        return instance;
    }
}
