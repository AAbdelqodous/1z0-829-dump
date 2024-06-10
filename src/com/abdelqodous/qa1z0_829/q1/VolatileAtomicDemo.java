package com.abdelqodous.qa1z0_829.q1;

public class VolatileAtomicDemo {
    public static void main(String[] args) {
        Test t = new Test();

        Runnable r1 = () ->{
            Thread trd = Thread.currentThread();
            while (t.x < 3){
                System.out.print(trd.getName() + " : " + t.x + " : ");
                t.x++;
            }
        };

        Runnable r2 = () -> {
            Thread trd = Thread.currentThread();
            while (t.xObj.get() < 3){
                System.out.print(trd.getName() + " : " + t.xObj.get() + " : ");
                t.xObj.getAndIncrement();
            }
        };

        Thread thread1 = new Thread(r1, "t1");
        Thread thread2 = new Thread(r2, "t2");

        thread1.start();
        thread2.start();

        // The program prints t1 : 1 : t2 : 1: t1 : 2 : t2 : 2 : in random order.
    }
}
