package com.itheima.prototype.demo1;

public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("被创建了");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("复制成功");
        return (Realizetype)super.clone();
    }
}
