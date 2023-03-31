package com.itheima.pattern.factory.demo1.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

//    加载配置文件，获取配置文件中的全类名，并创建该类的对象
//    定义容器对象
    private static HashMap<String ,Coffee> map =new HashMap<>();

//    加载配置文件
    static {
//        创建Properties对象
    Properties p=new Properties();
    InputStream is =CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
    try {
        p.load(is);
        Set<Object> keys=p.keySet();
        for(Object key:keys){
            String className=p.getProperty((String)key);
//            通过反射技术创建对象
            Class clazz=Class.forName(className);
            Coffee coffee =(Coffee) clazz.getDeclaredConstructor().newInstance();
//            存储下来
            map.put((String)key, coffee);
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
//根据名称返回对象
    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}
