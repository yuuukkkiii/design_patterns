package com.itheima.pattern.factory.demo1.abstract_factory;

//意大利风味甜品工厂
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
