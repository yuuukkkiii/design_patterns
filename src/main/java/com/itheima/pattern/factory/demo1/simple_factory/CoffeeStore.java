package com.itheima.pattern.factory.demo1.simple_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type){
//        声明Coffee对象
        SimpleCoffeeFactory factory=new SimpleCoffeeFactory();
//      调用生产咖啡的方法
        Coffee coffee=factory.createCoffee(type);


        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
