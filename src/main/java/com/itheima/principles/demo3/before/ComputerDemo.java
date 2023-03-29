package com.itheima.principles.demo3.before;

public class ComputerDemo {
    public static void main(String[] args) {
//        创建计算机
        Computer computer=new Computer();
//        创建组件
        XiJieHardDisk hardDisk=new XiJieHardDisk();
        KingstonMemory memory=new KingstonMemory();
        IntelCpu cpu=new IntelCpu();
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);
//        运行
        computer.run();
    }
}
