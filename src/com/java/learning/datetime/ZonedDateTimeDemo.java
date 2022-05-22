package com.java.learning.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeDemo {
    public static void main(String ar[]){
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        zoneIds.stream().forEach(System.out::println);

        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);

        System.out.println(zonedDateTime.getDayOfYear());
    }
}
