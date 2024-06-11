package com.abdelqodous.qa1z0_829.q33;

import java.util.Arrays;

public class EnumSwitch {
    public static void main(String[] args) {
        Arrays.stream( Desig.values()).dropWhile( s -> s.equals(Desig.CMO));
        switch (Desig.valueOf("CMO")){
            case CEO -> System.out.println("Executive");
            case CMO -> System.out.println("Marketing");
            case CFO -> System.out.println("Finance");
            case CTO -> System.out.println("Technical");
            default -> System.out.println("Un Defined");
        }
    }
}
