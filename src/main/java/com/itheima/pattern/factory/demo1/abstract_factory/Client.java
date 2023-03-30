package com.itheima.pattern.factory.demo1.abstract_factory;

public class Client {
    public static void main(String[] args) {
//        创建的是意大利风格甜品工厂对象
        AmericanDessertFactory factory =new AmericanDessertFactory();
//        获取拿铁咖啡和匹拉米苏甜品
        Coffee coffee=factory.createCoffee();
        Dessert dessert=factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();

    }
}
