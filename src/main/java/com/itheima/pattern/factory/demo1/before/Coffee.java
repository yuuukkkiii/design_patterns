package com.itheima.pattern.factory.demo1.before;

//咖啡类
public abstract class Coffee {
    public abstract String getName();
//    加糖
    public void addSugar(){
        System.out.println("加糖");
    }

    public void addMilk(){
        System.out.println("加奶");
    }
}
