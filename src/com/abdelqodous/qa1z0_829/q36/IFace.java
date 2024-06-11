package com.abdelqodous.qa1z0_829.q36;

public interface IFace {
    public void m1();

    public default void m2(){
        System.out.println("m2");
    }

    public static void m3(){
        System.out.println("m3");
    }

    private void m4(){
        System.out.println("m4");
    }
}
