package com.abdelqodous.qa1z0_829.q16;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        Console console = System.console(); //line n1
        String input = console.readLine("Input a number: ");
        int number = Integer.parseInt(input);

        if(number % 2 == 0){
            System.out.println(number + " is even.");
        }else{
            System.out.println(number + " is odd");
        }
    }
}
