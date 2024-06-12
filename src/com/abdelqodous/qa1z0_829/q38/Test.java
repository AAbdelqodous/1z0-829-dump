package com.abdelqodous.qa1z0_829.q38;

import java.util.List;

public class Test {

    public String attach1(List<String> data){
        return data.parallelStream().reduce("w", (n, m) -> n + m, String::concat);
    }

    public String attach2(List<String> data){
        return data.parallelStream().reduce( (l, p) -> l + p).get(); //Required type: String, so get() used
    }

    public static void main(String[] args) {
        Test t = new Test();
        var list = List.of("table", "chair");

        String x = t.attach1(list);
        String y = t.attach2(list);

        System.out.println(x + " " +y);
    }
}
