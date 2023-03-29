package com.itheima.pattern.factory.demo1.static_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type){

//      调用生产咖啡的方法
        Coffee coffee=SimpleCoffeeFactory.createCoffee(type);


        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
