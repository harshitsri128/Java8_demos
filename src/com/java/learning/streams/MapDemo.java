package com.java.learning.streams;

import com.java.learning.supplier.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("Test");
        list.add("ABC");
        list.add("Hello");
        list.add("Yes");

        list.stream().map(str -> str.toLowerCase()).forEach(System.out::println);

        list.stream().mapToInt(str -> str.length()).forEach(System.out::println);

        List<Employee> employeeList = new ArrayList<>();
        Employee e1=new Employee(1,"AMit",100000);
        Employee e2=new Employee(2,"Ronn",80000);
        Employee e3=new Employee(3,"ROhan",90000);
        Employee e4=new Employee(4,"John",200000);
        Employee e5=new Employee(5,"Joey",150000);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        employeeList.stream().map(employee -> {
            employee.setSalary(employee.getSalary()+10000);
            return employee;
                })
                .forEach(emp-> System.out.println(emp.getName()+" "+emp.getSalary()));


        List<List<String>> listFlat = new ArrayList<>();
        listFlat.add(Arrays.asList("a","b","c"));
        listFlat.add(Arrays.asList("d","e","f"));
        listFlat.add(Arrays.asList("g","h","i"));
        listFlat.add(Arrays.asList("j","k","l"));

        listFlat.stream().flatMap(innerList->innerList.stream()).map(s ->s.toUpperCase())
                .forEach(System.out::println);

    }
}
