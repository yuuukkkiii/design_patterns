package com.itheima.pattern.factory.demo1.before;

public class CoffeeStore {
    public Coffee orderCoffee(String type){
//        声明Coffee对象
        Coffee coffee=null;
        if("american".equals(type)){
            coffee=new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee=new LatteCoffee();
        }else{
            throw new RuntimeException("对不起，没有您点的咖啡");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
