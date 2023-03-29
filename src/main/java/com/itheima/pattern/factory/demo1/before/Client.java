package com.itheima.pattern.factory.demo1.before;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store=new CoffeeStore();
//        点咖啡
        Coffee coffee=store.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
