package com.itheima.principles.demo3.after;

public class ComputerDemo {
    public static void main(String[] args) {
//        创建计算机
        Computer computer=new Computer();
//        创建组件
        HardDisk hardDisk=new XiJieHardDisk();
        Memory memory=new KingstonMemory();
        Cpu cpu=new IntelCpu();
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);
//        运行
        computer.run();
    }
}
