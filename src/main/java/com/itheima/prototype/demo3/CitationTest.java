package com.itheima.prototype.demo3;

import java.io.*;

public class CitationTest {
    public static void main(String[] args) throws Exception {
//        创建对象
        Citation citation=new Citation();
//        克隆对象

//        citation.setName("张三");
//        citation1.setName("李四");
        Student stu=new Student();
        stu.setName("张三");
        citation.setStu(stu);

//        创建对象输出流对象
        ObjectOutputStream oss=new ObjectOutputStream(new FileOutputStream("d:/robin/a.txt"));
//        写对象
        oss.writeObject(citation);
//        释放对象
        oss.close();
//        创建输入流
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("d:/robin/a.txt"));
        Citation  citation1=(Citation) ois.readObject();
        ois.close();

        citation1.getStu().setName("李四");
        citation.show();
        citation1.show();
    }
}
