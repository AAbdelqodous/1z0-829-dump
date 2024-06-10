package com.abdelqodous.qa1z0_829.q8;

import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> specialDays = List.of("New Year", "Valentines", "Spring", "Labour");
        System.out.print(specialDays.stream().allMatch( s -> s.equals("Labour")));
        System.out.print(" " +specialDays.stream().anyMatch( s -> s.equals("Labour")));
        System.out.print(" " +specialDays.stream().noneMatch( s -> s.equals("Halloween")));
        System.out.print(" " +specialDays.stream().findFirst());
    }
}
