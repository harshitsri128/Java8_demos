package com.java.learning.streams;

import com.java.learning.supplier.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingDemo {
    public static void main(String ar[]){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Emp1", 200000.0));
        employeeList.add(new Employee(2, "Emp2", 300000.0));
        employeeList.add(new Employee(3, "Emp3", 400000.0));
        employeeList.add(new Employee(4, "Emp4", 400000.0));
        employeeList.add(new Employee(5, "Emp5", 600000.0));

        Map<Double,List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.toList()));
        System.out.println(map);

        //group by mulitple
        Map<String,Map<Double,List<Employee>>> mapMap =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.groupingBy(Employee::getSalary)));
        System.out.println(mapMap);
    }
}
