package com.abdelqodous.qa1z0_829.q10;

public class Main {
    void print(int i){
        System.out.println("hello");
    }

    void print(long i){
        System.out.println("there");
    }

    public static void main(String[] args) {
        new Main().print(0b1101_1010);
    }
}
