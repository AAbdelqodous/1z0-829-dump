package com.abdelqodous.qa1z0_829.q12;
class A {
    public void mA(){
        System.out.println("mA");
    }
}

class B extends A {
    public void mB(){
        System.out.println("mB");
    }
}

class C extends B {
    public void mC(){
        System.out.println("mc");
    }
}

public class App {
    public static void main(String[] args) {
        A bobj = new B();
        A cobj = new C();

        if (cobj instanceof B v){
            v.mB();

            if (v instanceof C v1){
                v1.mC();
            }
        }else {
            cobj.mA();
        }
    }
}
