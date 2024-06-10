package com.abdelqodous.qa1z0_829.q1;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    volatile int x = 1;
    AtomicInteger xObj = new AtomicInteger(x);
}
