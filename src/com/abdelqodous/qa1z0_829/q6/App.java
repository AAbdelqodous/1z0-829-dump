package com.abdelqodous.qa1z0_829.q6;

record Product(int pNumber, String pName){
    static int regNo = 100; //int regNo = 100;
    public int getRegNo(){
        return regNo;
    }
}

public class App {
    public static void main(String[] args) {
        Product p1 = new Product(1111, "Inc Bottle");
        System.out.println(p1.getRegNo());
    }
}
