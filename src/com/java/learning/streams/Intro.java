package com.java.learning.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Intro {
    public static void main(String args[]){
        Stream<Integer> st = Stream.of(1,4,5,6,7,8);
        st.forEach(p -> System.out.println(p));

        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(34);
        list.add(55);
        Stream<Integer> s = list.stream();
        s.forEach(val -> System.out.println(val));

        IntStream intStream = IntStream.of(2,5,2,3);
        intStream.forEach(val -> System.out.println(val));
    }
}
