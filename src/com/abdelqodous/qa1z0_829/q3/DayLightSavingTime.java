package com.abdelqodous.qa1z0_829.q3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DayLightSavingTime {
    public static void main(String[] args) {
        ZoneId zoneID = ZoneId.of("America/Chicago");
        ZonedDateTime zdt = ZonedDateTime.of(
                LocalDate.of(2021, 11, 7),
                LocalTime.of(1, 30),
                zoneID);
        System.out.println("zdt: " + zdt);

        ZonedDateTime anHourLater = zdt.plusHours(1);
        System.out.println("anHourLater: " + anHourLater);

        System.out.println( zdt.getHour() == anHourLater.getHour());
        System.out.println( zdt.getOffset() == anHourLater.getOffset());

        /*Daylight Saving Time (Day light saving time) is the practice of advancing clocks at the start of spring
        by one hour and adjusting them backward by one hour in autumn.
        Considering that in 2021, Day light saving time in Chicago (Illinois) ended on November 7th at 2 AM,
        and given the fragment:*/
    }
}
