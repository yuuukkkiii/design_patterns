package com.itheima.principles.demo4.after;

public class ZhaihaoSafetyDoor implements AntiTheft,FireProof,WaterProof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
