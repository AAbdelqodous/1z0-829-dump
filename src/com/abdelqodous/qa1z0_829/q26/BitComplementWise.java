package com.abdelqodous.qa1z0_829.q26;

public class BitComplementWise {
    public static void main(String[] args) {
        int a = 2;                          // 0000 0010
        int b = ~a;                         // 1111 1101
        int c = a^b;                        // 1111 1111 -ve => 1111 1111 which is: -1
        System.out.println("c: " +c);       // c = -1
        boolean d = a < b & a > c++;        // c = 0    continue increment
        System.out.println(d + " " + c);

        boolean e = a > b && a > c++;       // c = 1
        System.out.println(e + " " +c);
    }
}
