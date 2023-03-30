package com.itheima.pattern.factory.demo1.abstract_factory;

//甜品工厂
public interface DessertFactory {
//    生产咖啡
    Coffee createCoffee();
//    生产甜品
    Dessert createDessert();
}
