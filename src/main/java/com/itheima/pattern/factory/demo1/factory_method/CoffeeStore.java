package com.itheima.pattern.factory.demo1.factory_method;

public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory=factory;
    }
    public Coffee orderCoffee(){

//      调用生产咖啡的方法
        Coffee coffee=factory.createCoffee();

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
