package com.java.learning.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateDemo {
    static boolean isEligibleForHike(Employee employee, Integer yoe,BiPredicate<Employee,Integer> predicate){
        return predicate.test(employee,yoe);
    }
    public static void main(String args[]){
        Employee employee = new Employee(1,"Ram",10000.0,4);
        BiPredicate<Employee,Integer> biPredicate = (emp,yoe)-> {
            return emp.yoe > yoe || emp.salary<100000;
        };

        if(isEligibleForHike(employee,5,biPredicate))
            System.out.println("Eligible for hike");
        else
            System.out.println("Not eligible for hike");
    }
}
