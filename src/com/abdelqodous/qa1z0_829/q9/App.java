package com.abdelqodous.qa1z0_829.q9;

public class App {
    String name;
    public App(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        App t1 = new App("t1");
        App t2 = new App("t2");

        t1 = t2;
        t1 = null;

        System.out.println("GC");
    }
}
