package com.abdelqodous.qa1z0_829.q22;

import javax.print.attribute.IntegerSyntax;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer sReduce = listOfNumbers.stream().reduce(0, Integer::sum) + 5;
        Integer psReduce = listOfNumbers.parallelStream().reduce(0, Integer::sum) + 5;
        Integer psReduceOrElse = listOfNumbers.parallelStream().reduce((m, n) -> m + n).orElse(5) + 5;
        Integer reduceSeed = listOfNumbers.parallelStream().reduce(5, Integer::sum);
        Integer reduce = listOfNumbers.stream().reduce(5, (a, b) -> a + b);

        System.out.println(sReduce);
        System.out.println(psReduce);
        System.out.println(psReduceOrElse);
        System.out.println(reduceSeed);
        System.out.println(reduce);
    }
}
