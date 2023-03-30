package com.itheima.pattern.factory.demo1.abstract_factory;

//美式风味工厂
public class AmericanDessertFactory implements DessertFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
