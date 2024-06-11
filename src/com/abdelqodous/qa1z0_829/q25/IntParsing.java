package com.abdelqodous.qa1z0_829.q25;

public class IntParsing {
    public static void main(String[] args) {
        String s = "10_00";
        Integer s2 = 10_00;

        /*Integer res1 = 250 + Integer.parseInt(s); // line 1 --NumberFormatException: For input string: "10_00"
        System.out.println(res1);*/

        /*Integer res2 = 250 + Integer.valueOf(s); // NumberFormatException: For input string: "10_00"
        System.out.println(res2);*/

        Integer res3 = 250 + s2;
        System.out.println("res3: " +res3); // 1250

        Integer res4 = 250;
        res4 =+ s2;
        System.out.println("res4: " +res4); // 1000

        /*Integer res5 = 250 + s; // required int provides String*/

        /*Integer res6 = 250 + Integer(s2);*/
    }
}
