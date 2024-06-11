package com.abdelqodous.qa1z0_829.q18;

public class TextBlock {
    public static void main(String[] args) {
        String myStr = "Hello java 17";
        String myTextBlk1 = """
                            Hello java 17""";
        String myTextBlk2 = """
                            Hello java 17
                            """;

        System.out.print(myStr.equals(myTextBlk1) + ":");
        System.out.print(myStr.equals(myTextBlk2) + ":");
        System.out.print(myTextBlk1.equals(myTextBlk2) + ":");
        System.out.print(myTextBlk1.intern() == myTextBlk2.intern());
    }
}
