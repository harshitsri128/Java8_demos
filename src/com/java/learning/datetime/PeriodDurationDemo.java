package com.java.learning.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDurationDemo {
    public static void main(String ar[]){
        Period period = Period.between(LocalDate.now(),LocalDate.of(2012,2,23));
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period.getChronology());

        Duration duration = Duration.between(LocalTime.now(),LocalTime.of(12,9));
        System.out.println(duration);

        duration = Duration.ofMinutes(34);
        System.out.println(duration.getSeconds());
    }
}
