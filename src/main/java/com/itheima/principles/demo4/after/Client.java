package com.itheima.principles.demo4.after;



public class Client {
    public static void main(String[] args) {
        ZhaihaoSafetyDoor door =new ZhaihaoSafetyDoor();
        door.antiTheft();
        door.fireproof();
        door.waterProof();

        System.out.println("===================");
        ItcastSafetyDoor door1=new ItcastSafetyDoor();
        door1.antiTheft();
        door1.fireproof();
    }
}
