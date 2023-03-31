package com.itheima.prototype.demo3;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {
//    三好学生姓名
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }

    public void show(){
        System.out.println(stu.getName()+"同学是三好学生");
    }
}
