package com.abdelqodous.qa1z0_829.q31;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NioDemo {
    public static void main(String[] args) {
        Path p = new File("src/com/abdelqodous/qa1z0_829/q31/data.txt").toPath();
        try {
            Stream<String> lines = Files.lines(p);
            String data = lines.collect(Collectors.joining("-"));
            System.out.println(data);

            String data2 = Files.readAllLines(p).get(3); //IndexOutOfBoundsException: Index 3 out of bounds for length 1
            System.out.println(data2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
