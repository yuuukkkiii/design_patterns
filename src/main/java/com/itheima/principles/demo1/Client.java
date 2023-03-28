package com.itheima.principles.demo1;

//测试类
public class Client {
    public static void main(String[] args) {
//        创建搜狗输入法对象
        SougouInput input=new SougouInput();
//        创建皮肤对象
        //DefaultSkin skin=new DefaultSkin();

        ZhaihSkin skin =new ZhaihSkin();

        input.setSkin(skin);
//        显示对象
        input.display();
    }
}
