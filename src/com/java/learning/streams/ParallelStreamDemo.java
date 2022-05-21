package com.java.learning.streams;

import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String args[]){
        Stream.of(1,3,5,6,6).forEach(num-> System.out.println(num+ " "+Thread.currentThread().getName()));

        Stream.of(1,3,5,6,6).parallel().forEach(num-> System.out.println(num+ " "+Thread.currentThread().getName()));

        /*
        NQ Model:

N x Q > 10000

where,
N = number of data items
Q = amount of work per item
         */
    }
}
