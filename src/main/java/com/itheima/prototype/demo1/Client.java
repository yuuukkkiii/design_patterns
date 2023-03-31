package com.itheima.prototype.demo1;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
//        创建原型对象
        Realizetype realizetype=new Realizetype();
//        调用clone方法
        Realizetype clone =realizetype.clone();
        System.out.println("原型对象和克隆出的对象是否是同一个："+(realizetype==clone));
    }
}
