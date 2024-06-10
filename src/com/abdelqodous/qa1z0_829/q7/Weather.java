package com.abdelqodous.qa1z0_829.q7;

public class Weather {

    public enum Forecast{
        SUNNY, CLOUDY, RAINY;

        @Override
        public String toString() {
            return "SNOWY";
        }
    }

    public static void main(String[] args) {
        System.out.print( Forecast.SUNNY.ordinal() + " ");
        System.out.print( Forecast.valueOf("cloudy".toUpperCase()));
    }
}
