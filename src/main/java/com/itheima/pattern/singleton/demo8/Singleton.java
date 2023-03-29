package com.itheima.pattern.singleton.demo8;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static boolean flag=false;
    private Singleton() {
//        判断flag的值是否为true，如果是true，说明非第一次访问
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE =new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
