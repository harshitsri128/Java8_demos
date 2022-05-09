package com.java.learning.streams;

import com.java.learning.function.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FilterDemo {
    public static void main (String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(511);
        list.add(343);
        list.add(90);
        list.stream().filter(num -> num>10).forEach(num -> System.out.println(num));
        System.out.println();
        list.stream().filter(num -> num>10).filter(num -> num%2 ==0).forEach(num -> System.out.println(num));


        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("Dave", 23));
        list2.add(new Person("Joe", 18));
        list2.add(new Person("Ryan", 54));
        list2.add(new Person("Iyan", 5));
        list2.add(new Person("Ray", 63));

        list2.stream().filter(person -> person.getName() !=null)
                .filter(person -> person.getAge()>18)
                .filter(person -> person.getAge() <60)
                .forEach(System.out::println);

    }
}
