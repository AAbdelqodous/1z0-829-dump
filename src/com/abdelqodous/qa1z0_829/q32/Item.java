package com.abdelqodous.qa1z0_829.q32;

public class Item {
    static String name;

    public static void display(){
        name = "Vase";  // static method can't use instance variable
        System.out.println(name);
    }

    public void display(String design){
        this.name += name;          // obj. variable = obj. variable + static variable
        System.out.println(name);   //nullnull
    }
}
