package com.java.srv.practice;

public class Interface {
    public static void main(String[] args) {
        SouravCycle c = new SouravCycle();
        c.brakes();
        c.frames();
        c.lable();
        c.sticker();
    }
}

interface BycycleParts{
    void frames();
    void brakes();
}

interface BycycleDesign{
    void sticker();
    void lable();
}

class SouravCycle implements BycycleParts,BycycleDesign{
    public void frames(){
        System.out.println("Aluminium frames");
    }
    public void brakes() {
        System.out.println("Abs brakes");
    }
    public void sticker(){
        System.out.println("Monster sticker");
    }
    public void lable(){
        System.out.println("Company lables");
    }

}
