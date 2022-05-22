package com.java.learning.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
    public static void main(String ar[]){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        localDate = LocalDate.of(1993, Month.AUGUST,12);
        System.out.println(localDate);

        localDate = LocalDate.parse("1993-09-19");
        System.out.println(localDate);

        localDate = LocalDate.parse("12-05-1993", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(localDate);

        localDate = LocalDate.parse("1993-09-19").plus(4, ChronoUnit.MONTHS);
        System.out.println(localDate);

        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        System.out.println(dayOfWeek);

        boolean isBefore = LocalDate.parse("2021-02-12")
                .isBefore(LocalDate.parse("2018-06-14"));
        System.out.println(isBefore);

    }
}
