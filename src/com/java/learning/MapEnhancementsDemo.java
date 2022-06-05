package com.java.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapEnhancementsDemo {
    public static void  main(String ar[]){
        Map<String,Integer> marksMap = new HashMap<>();
        marksMap.put("Rohan",45);
        marksMap.put("Mohan",60);
        marksMap.put("Sohan",90);
        marksMap.put("Raman",80);
        //compute
        marksMap.compute("Mohan",(k,v)-> v==null? 33 : v+10);
        marksMap.compute("Hash",(k,v) -> v ==null ? 33 : v+10);
        System.out.println(marksMap);

        //computeIfAbsent
        marksMap.computeIfAbsent("Lime", k-> k.length());
        System.out.println(marksMap);

        //computeIfPresent
        marksMap.computeIfPresent("Lime", (k,v) -> v==null? 33 : v+10);
        System.out.println(marksMap);

        //merge
        Map<String,Integer> marksMapSem2 = new HashMap<>();
        marksMapSem2.put("Rohan",55);
        marksMapSem2.put("Mohan",65);
        marksMapSem2.put("Sohan",92);
        marksMapSem2.put("Raman",84);
        marksMap.forEach((k,v) -> marksMapSem2.merge(k,v, (v1,v2)-> v1+v2));
        System.out.println(marksMapSem2);

        marksMapSem2.entrySet()
                .stream()
                .sorted(Map.Entry.< String,Integer >comparingByKey())
                .forEach(System.out::println);
        System.out.println();
        marksMapSem2.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
