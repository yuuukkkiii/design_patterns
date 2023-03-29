package com.itheima.pattern.factory.demo1.static_factory;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store=new CoffeeStore();
        Coffee coffee=store.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
