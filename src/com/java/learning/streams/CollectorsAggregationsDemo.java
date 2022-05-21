package com.java.learning.streams;

import com.java.learning.supplier.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsAggregationsDemo {
    public static void main(String ar[]){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Emp1", 200000.0));
        employeeList.add(new Employee(2, "Emp2", 300000.0));
        employeeList.add(new Employee(3, "Emp3", 400000.0));
        employeeList.add(new Employee(4, "Emp4", 800000.0));
        employeeList.add(new Employee(5, "Emp5", 600000.0));

        long count = employeeList.stream().filter(employee -> employee.getSalary()>200000.0)
                .collect(Collectors.counting());
        System.out.println(count);

        int sum  = employeeList.stream()
                .collect(Collectors.summingInt(employee -> employee.getId()));
        System.out.println(sum);

        double avg  = employeeList.stream()
                .collect(Collectors.averagingInt(emp -> emp.getId()));
        System.out.println(avg);

        Optional<Employee> employee = employeeList.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));

        System.out.println(employee.get().getName());

        DoubleSummaryStatistics summaryStatistics = employeeList.stream()
                .collect(Collectors.summarizingDouble(employee1->employee1.getSalary()));
        System.out.println(summaryStatistics);

        String joinedString = Stream.of("hello", "how", "are" , "you")
                .collect(Collectors.joining(","));
        System.out.println(joinedString);
    }
}
