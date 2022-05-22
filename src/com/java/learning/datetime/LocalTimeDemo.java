package com.java.learning.datetime;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String ar[]){
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        localTime=LocalTime.of(11,45);
        System.out.println(localTime);

        localTime=LocalTime.parse("21:20");
        System.out.println(localTime);

        localTime=LocalTime.now().plusMinutes(50);
        System.out.println(localTime);

        int minute=LocalTime.now().getMinute();
        System.out.println(minute);

        boolean isBefore = LocalTime.parse("02:23")
                .isBefore(LocalTime.parse("03:20"));
        System.out.println(isBefore);
    }
}
