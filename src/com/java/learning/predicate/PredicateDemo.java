package com.java.learning.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    static boolean isEligibleForHike(Employee employee, Predicate<Employee> predicate){
        return predicate.test(employee);
    }
    public static void main(String args[]){
        Employee employee = new Employee(1,"Ram",10000.0,4);
        Predicate<Employee> predicate = emp-> emp.salary<100000;
        Predicate<Employee> predicate1 = employee1 -> employee1.yoe>4;
        Predicate<Employee> finalPred  = predicate.or(predicate1);
        if(isEligibleForHike(employee,finalPred))
            System.out.println("Eligible for hike");
        else
            System.out.println("Not eligible for hike");
    }
}
