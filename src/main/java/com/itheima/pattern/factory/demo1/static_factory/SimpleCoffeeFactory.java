package com.itheima.pattern.factory.demo1.static_factory;

//简单咖啡工厂类
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type){
        //        声明Coffee对象
        Coffee coffee=null;
        if("american".equals(type)){
            coffee=new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee=new LatteCoffee();
        }else{
            throw new RuntimeException("对不起，没有您点的咖啡");
        }
        return coffee;
    }
}
