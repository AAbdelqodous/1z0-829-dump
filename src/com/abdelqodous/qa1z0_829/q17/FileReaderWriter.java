package com.abdelqodous.qa1z0_829.q17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        char[] buffer = new char[8];
        int count = 0;
        try (FileReader in = new FileReader("src/com/abdelqodous/qa1z0_829/q17/in.txt");
             FileWriter out = new FileWriter("src/com/abdelqodous/qa1z0_829/q17/out.txt")) {
            while (( count = in.read(buffer)) != -1){
                out.write(buffer);
            }
        }

    }
}
