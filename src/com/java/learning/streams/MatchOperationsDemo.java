package com.java.learning.streams;

import com.java.learning.supplier.Employee;

import java.util.ArrayList;
import java.util.List;

public class MatchOperationsDemo {
    public static void main(String args[]) {

        List<String> empNames = new ArrayList<>();
        empNames.add("raman");
        empNames.add("pallav");
        empNames.add("rRomit");
        empNames.add("pany");
        //anyMatch
        boolean present= empNames.stream().map(Employee::new).anyMatch(employee -> employee.getName().startsWith("pa"));
        System.out.println(present);

        //allMatch
        present=empNames.stream().map(Employee::new).allMatch(employee -> employee.getSalary()!=0);
        System.out.println(present);
        present=empNames.stream().map(Employee::new).allMatch(employee -> employee.getName().startsWith("pa"));
        System.out.println(present);

        //noneMatch
        present=empNames.stream().map(Employee::new).noneMatch(employee -> employee.getSalary()>0);
        System.out.println(present);
    }
}
