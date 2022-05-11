package com.java.learning.streams;

import com.java.learning.supplier.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingOperationsDemo {
    public static void main(String args[]) {
        List<String> empNames = new ArrayList<>();
        empNames.add("raman");
        empNames.add("pallav");
        empNames.add("rRomit");
        empNames.add("pany");

        //findFirst
        Optional<Employee> optionalEmployee= empNames.stream().map(Employee::new).filter(employee -> employee.getName().startsWith("pa")).findFirst();
        if(optionalEmployee.isPresent())
            System.out.println(optionalEmployee.get().getName());

        //findAny
        optionalEmployee= empNames.stream().map(Employee::new).filter(employee -> employee.getName().startsWith("pa")).findAny();
        if(optionalEmployee.isPresent())
            System.out.println(optionalEmployee.get().getName());
    }
}
