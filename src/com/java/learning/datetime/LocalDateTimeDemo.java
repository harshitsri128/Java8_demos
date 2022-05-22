package com.java.learning.datetime;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String ar[]){
        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime);

        localDateTime= LocalDateTime.of(2021,3,12,23,11);
        System.out.println(localDateTime);

        localDateTime= LocalDateTime.parse("2022-05-22T17:49:21");
        System.out.println(localDateTime);

        localDateTime= LocalDateTime.parse("2022-05-22T17:49:21").plusDays(3);
        System.out.println(localDateTime);
    }
}
