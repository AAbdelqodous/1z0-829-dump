package com.abdelqodous.qa1z0_829.q20;

public class SwitchDemo {
    public static void main(String[] args) {
        final int x = 2;
        int y = x;

        while (y < 3){
            switch (y){
                case 0+x:
                    y++; // No break; has been using
                case 1:
                    y++; // No break; has been using
            }
        }
        System.out.println(y);
    }
}
