package com.abdelqodous.qa1z0_829.q23;

public class App {
    public int x = 100;

    public static void main(String[] args) {
        int x = 1000;
        App t = new App();
        t.myMethod(x);
        System.out.println(x); // passing by value
    }

    public void myMethod(int x){
        x++;
        System.out.println(x);
        System.out.println(this.x);
    }
}
