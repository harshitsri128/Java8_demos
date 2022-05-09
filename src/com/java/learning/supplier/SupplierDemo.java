package com.java.learning.supplier;


import java.util.function.BiPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {
    static boolean isEligibleForHike(Supplier<Employee> supplier, Predicate<Employee> predicate
                                     ){
        return predicate.test(supplier.get());
    }
    public static void main(String args[]){
        Supplier<Employee> supplier= () -> new Employee( 1,"Ram",150000.0,4);
        Predicate<Employee> predicate = employee -> employee.salary<100000;

        if(isEligibleForHike(supplier,predicate))
            System.out.println("Eligible for hike");
        else
            System.out.println("Not eligible for hike");

        IntSupplier intSupplier = ()->(int)(Math.random()*10);
        System.out.println(intSupplier.getAsInt());
    }
}
