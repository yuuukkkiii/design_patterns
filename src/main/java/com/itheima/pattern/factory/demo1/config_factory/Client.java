package com.itheima.pattern.factory.demo1.config_factory;

public class Client {
    public static void main(String[] args) {
        Coffee coffee=CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
        System.out.println("=================");
        Coffee coffee1=CoffeeFactory.createCoffee("latte");
        System.out.println(coffee1.getName());
    }
}
