package com.itheima.pattern.factory.demo1.factory_method;

//美式咖啡工厂对象
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
