package com.itheima.pattern.factory.demo1.factory_method;


public class Client {
    public static void main(String[] args) {
//        创建咖啡店对象
        CoffeeStore store=new CoffeeStore();
//        创建工厂对象
        CoffeeFactory factory=new AmericanCoffeeFactory();
        store.setFactory(factory);
        Coffee coffee=store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
