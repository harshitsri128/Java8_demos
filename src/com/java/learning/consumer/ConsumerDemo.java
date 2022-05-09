package com.java.learning.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String args[]){
        Consumer<String> cus1 = (arg) -> System.out.println(" Hello "+arg);
        cus1.accept("Harshit");
        Consumer<Integer> cusYoe= (arg) -> System.out.println(" Your YOE= "+arg);
        cusYoe.accept(6);
        Consumer<String> cusDept= (arg) -> System.out.println(" Your Dept= "+arg);
        cus1.andThen(cusDept).accept("Harshit");

        BiConsumer<String,Integer> biConsumer = (arg1,arg2)-> System.out.println("hello "+arg1+" Yoe = "+arg2);
        biConsumer.accept("Harshit",6);
    }

}
