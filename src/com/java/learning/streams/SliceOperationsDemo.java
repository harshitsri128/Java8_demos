package com.java.learning.streams;

import java.util.ArrayList;
import java.util.List;

public class SliceOperationsDemo {
    public static void main(String args[]){
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("China");
        countries.add("India");
        countries.add("UK");
        countries.add("China");
        //distinct
        countries.stream().distinct().forEach(System.out::println);
        System.out.println();
        //limit
        countries.stream().limit(3).forEach(System.out::println);
        System.out.println();
        //skip() is also an intermediate method. It returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream.
        countries.stream().distinct().skip(2).forEach(System.out::println);
    }
}
