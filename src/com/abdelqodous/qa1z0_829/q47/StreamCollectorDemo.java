package com.abdelqodous.qa1z0_829.q47;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectorDemo {

    public static void main(String[] args) {
        List<Product> p = List.of(
                new ElectronicProduct("CellPhone", 100),
                new ElectronicProduct("ToyCar", 90),
                new ElectronicProduct("Motor", 200),
                new ElectronicProduct("Fan", 300)
        );

        DoubleSummaryStatistics sts = p.stream()
                                        .filter(a -> a instanceof ElectronicProduct)
                                        .collect(Collectors.summarizingDouble(a -> a.price));
        String s1 = p.stream()
                    .filter( a -> a instanceof Product)
                    .collect(Collectors.mapping( p2 -> p2.name, Collectors.joining(",")));

        System.out.println(sts.getMax());
        System.out.println(s1);
    }
}
