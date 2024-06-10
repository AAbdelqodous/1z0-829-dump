package com.abdelqodous.qa1z0_829.q5;

import java.time.Duration;
import java.time.Period;

public class PeriodDuration {
    public static void main(String[] args){

        Duration duration = Duration.ofMillis(5000);
        System.out.println(duration);

        duration = Duration.ofSeconds(60);
        System.out.println(duration);

        Period period = Period.ofDays(6);
        System.out.println(period);
    }
}
