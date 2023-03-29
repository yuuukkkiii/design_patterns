package com.itheima.pattern.singleton.demo7;

import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE =new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    //    当进行反序列化时，会自动调用该方法，返回返回值
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
