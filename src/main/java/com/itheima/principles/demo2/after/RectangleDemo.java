package com.itheima.principles.demo2.after;


//测试类
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
//        设置长宽
        r.setLength(20);
        r.setWidth(10);
//        拓宽
        resize(r);
        printLengthAndWidth(r);
        System.out.println("====================");
        Square s=new Square();
        s.setSide(10);
        printLengthAndWidth(s);
    }

//    拓宽方法
    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

//    打印
    public static void printLengthAndWidth(Quadrilateral quadrilateral){
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
