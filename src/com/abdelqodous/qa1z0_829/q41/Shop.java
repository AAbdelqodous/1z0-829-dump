package com.abdelqodous.qa1z0_829.q41;

import java.io.*;

public class Shop {
    public static void main(String[] args) {
        Product p = new Product("cookie", 3.99f);

        try {
            try (ObjectOutputStream out =
                         new ObjectOutputStream( new FileOutputStream("src/com/abdelqodous/qa1z0_829/q41/p.ser"))){
                out.writeObject(p);
            }

            try (ObjectInputStream in =
                         new ObjectInputStream( new FileInputStream("src/com/abdelqodous/qa1z0_829/q41/p.ser"))){
                p = (Product) in.readObject();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(p);
    }
}
