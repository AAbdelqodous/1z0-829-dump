package com.abdelqodous.qa1z0_829.q4;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class InstantDemo {
    public static void main(String[] args) throws InterruptedException {

        //login time: 2021-01-12T21:58:18.817Z
        Instant loginTime = Instant.now();
        Thread.sleep(1000);

        //logout time: 2021-01-12T21:58:19.880Z
        Instant logoutTime = Instant.now();

        loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES); //line1
        logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(loginTime);  // 2021-01-12T21:58:00Z
        System.out.println(logoutTime); // 2021-01-12T21:58:00Z

        if (logoutTime.isAfter(loginTime)){
            System.out.println("Log out time: " +logoutTime);
        }else{
            System.out.println("Can't logout");
        }
    }
}
