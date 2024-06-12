package com.abdelqodous.qa1z0_829.q43;

import java.io.*;

public class AppStore {
    public static void main(String[] args) {
        Software s = new Game("Chess", 2);

        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("src/com/abdelqodous/qa1z0_829/q43/game.ser"))) {
            out.writeObject(s);
        } catch (Exception e) {
            System.out.println("write error");
        }

        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream("src/com/abdelqodous/qa1z0_829/q43/game.ser"))) {
            s = (Software) in.readObject();
        } catch (Exception e) {
            System.out.println("read error");
        }

        System.out.println(s);
    }
}
