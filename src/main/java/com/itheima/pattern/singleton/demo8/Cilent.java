package com.itheima.pattern.singleton.demo8;

import com.itheima.pattern.singleton.demo7.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Cilent {
    public static void main(String[] args) throws Exception {
        Class clazz=Singleton.class;
//        获取无参构造方法对象
        Constructor con=clazz.getDeclaredConstructor();
//        取消访问检查
        con.setAccessible(true);

        Singleton s1=(Singleton)con.newInstance();
        Singleton s2=(Singleton)con.newInstance();
        // writeObject2File();
        System.out.println(s1==s2);
    }


//    从文件读取数据
    public static void readObjectFromFile() throws Exception {
        ObjectInputStream oss =new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.txt"));
        com.itheima.pattern.singleton.demo7.Singleton instance=(com.itheima.pattern.singleton.demo7.Singleton) oss.readObject();
        System.out.println(instance);
        oss.close();
    }

//    向文件中写入数据
    public static void writeObject2File() throws Exception {
        com.itheima.pattern.singleton.demo7.Singleton instance= Singleton.getInstance();
        ObjectOutputStream oss=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\1.txt"));
        oss.writeObject(instance);
        oss.close();
    }
}
