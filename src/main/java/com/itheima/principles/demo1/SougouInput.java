package com.itheima.principles.demo1;

//搜狗输入法
public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin){
        this.skin=skin;
    }

    public void display(){
        this.skin.display();
    }
}
