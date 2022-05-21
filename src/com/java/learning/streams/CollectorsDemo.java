package com.java.learning.streams;

import com.java.learning.supplier.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String ar[]) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Emp1", 200000.0));
        employeeList.add(new Employee(2, "Emp2", 300000.0));
        employeeList.add(new Employee(3, "Emp3", 400000.0));
        employeeList.add(new Employee(4, "Emp4", 800000.0));
        employeeList.add(new Employee(5, "Emp5", 600000.0));
        //tolist
        List<Double> empSalList = employeeList.stream().map(employee -> employee.getSalary())
                .collect(Collectors.toList());
        System.out.println(empSalList);
        //to set
        Set<String> empNames = employeeList.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toSet());
        System.out.println(empNames);

        //tocollection
        LinkedList<String> empNamesLl = employeeList.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toCollection(() -> new LinkedList<>()));//LinkedList::new)
        System.out.println(empNamesLl);


        //tomap
        Map<String, Double> empMap = employeeList.stream()
                .collect(Collectors.toMap(employee -> employee.getName(),employee -> employee.getSalary()));
                System.out.println(empMap);
        //collectingAndThen
        List<String> empUnmodifiable = employeeList.stream().map(employee -> employee.getName())
                .collect(Collectors.collectingAndThen(Collectors.toList(),Collections::unmodifiableList));
        System.out.println(empUnmodifiable);

    }
}
