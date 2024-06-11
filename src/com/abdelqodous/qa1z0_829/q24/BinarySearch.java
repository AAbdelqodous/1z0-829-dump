package com.abdelqodous.qa1z0_829.q24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("e1");
        list.add("e3");
        list.add("e2");
//        list.add("e4");
//        list.add("e5");
//        list.add("e6");

        int x1 = Collections.binarySearch( list, "e3");
        System.out.println(list); // [e1, e3, e2]
        System.out.println(x1);

        Collections.sort(list);
        int x2 = Collections.binarySearch( list, "e3");
        System.out.println(list); // [e1, e2, e3]
        System.out.println(x2);

        Collections.reverse(list);
        System.out.println(list); // [e3, e2, e1]
        int x3 = Collections.binarySearch( list, "e3");
        System.out.println(x3);
    }
}
