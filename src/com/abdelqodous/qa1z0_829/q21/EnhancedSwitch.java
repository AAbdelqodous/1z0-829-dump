package com.abdelqodous.qa1z0_829.q21;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Integer rank = 4;
        switch (rank){
            case 1,4 -> System.out.println("Range1");
            case 5,8 -> System.out.println("Range2");
            case 9,10 -> System.out.println("Range");
            default -> System.out.println("Not a valid rank.");
        }
    }
}
