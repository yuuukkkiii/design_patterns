package com.itheima.prototype.demo2;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
//        创建对象
        Citation citation=new Citation();
//        克隆对象

//        citation.setName("张三");
//        citation1.setName("李四");
        Student stu=new Student();
        stu.setName("张三");
        citation.setStu(stu);

        Citation citation1=citation.clone();
        citation1.getStu().setName("李四");
        citation.show();
        citation1.show();
    }
}
