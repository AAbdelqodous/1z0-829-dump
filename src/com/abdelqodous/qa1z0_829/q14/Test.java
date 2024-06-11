package com.abdelqodous.qa1z0_829.q14;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("car", "truck", "car", "bicycle", "car", "truck", "motorcycle");
        Map<String, Long> outcome = elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(outcome);

        /*Map<Integer, Set<String>> mSet = elements.stream().collect(Collectors.groupingBy(String::length,
                Collectors.toSet()));
        System.out.println(mSet);*/ // {3=[car], 5=[truck], 7=[bicycle], 10=[motorcycle]}

        /*TreeMap<Integer, Set<String>> treeMapCollector = elements.stream().collect(
                Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(treeMapCollector)*/; // {3=[car], 5=[truck], 7=[bicycle], 10=[motorcycle]}

    }
}
