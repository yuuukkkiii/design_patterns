package com.itheima.principles.demo5;

public class Client {
    public static void main(String[] args) {
//        经纪人
        Agent agent=new Agent();
//        明星
        Star star=new Star("林青霞");
        agent.setStar(star);
//        创建粉丝对象并赋值
        Fans fans=new Fans("李四");
        agent.setFans(fans);
//        创建公司
        Company company=new Company("111公司");
        agent.setCompany(company);


        agent.meeting();/*和粉丝见面*/
        agent.business();/*和媒体公司洽谈业务*/
    }
}
