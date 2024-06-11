package com.abdelqodous.qa1z0_829.q35;

public class Test {
    static interface Animal{
    }

    static class Dog implements Animal{
    }

    private static void play(Animal a){
        System.out.print("flips");
    }

    private static void play(Dog d){
        System.out.print("runs");
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Dog a2 = new Dog();

        play(a1);  // it is a static method
        play(a2);
    }
}
