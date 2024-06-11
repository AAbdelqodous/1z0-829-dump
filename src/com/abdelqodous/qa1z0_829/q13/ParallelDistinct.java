package com.abdelqodous.qa1z0_829.q13;

import java.util.stream.Stream;

public class ParallelDistinct {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of( "A", "B", "C", "B");
        Stream<String> s2 = Stream.of( "A", "D", "E");

//        Stream.concat(s1, s2).forEach( element -> System.out.print( element)); // ABCBADE
//        Stream.concat(s1, s2).parallel().forEach( element -> System.out.print( element)); // AEDCBAB
        Stream.concat(s1, s2).parallel().distinct().forEach( element -> System.out.print( element)); // CDABE
    }
}
