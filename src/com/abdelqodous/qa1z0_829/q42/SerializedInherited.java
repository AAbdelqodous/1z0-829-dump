package com.abdelqodous.qa1z0_829.q42;

import java.io.*;

public class SerializedInherited {
                                        //throws IOException, ClassNotFoundException {
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        LuxuryCar b = new LuxuryCar("Wagon", 200);

        try (ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("src/com/abdelqodous/qa1z0_829/q42/car.ser"));
             ObjectInputStream ois =
                new ObjectInputStream( new FileInputStream("src/com/abdelqodous/qa1z0_829/q42/car.ser"))) {

            oos.writeObject(b);
            System.out.println( (Car) ois.readObject()); // line 3
        }
    }
}
