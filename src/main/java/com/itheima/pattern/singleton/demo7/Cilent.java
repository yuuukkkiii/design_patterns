package com.itheima.pattern.singleton.demo7;

import java.io.*;

public class Cilent {
    public static void main(String[] args) throws Exception {
       //writeObject2File();
       readObjectFromFile();
       readObjectFromFile();
    }


//    从文件读取数据
    public static void readObjectFromFile() throws Exception {
        ObjectInputStream oss =new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.txt"));
        Singleton instance=(Singleton) oss.readObject();
        System.out.println(instance);
        oss.close();
    }

//    向文件中写入数据
    public static void writeObject2File() throws Exception {
        Singleton instance=Singleton.getInstance();
        ObjectOutputStream oss=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\1.txt"));
        oss.writeObject(instance);
        oss.close();
    }
}
