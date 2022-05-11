package com.java.learning.streams;

import com.java.learning.supplier.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class MethodReferenceDemo {
    public static Double getNewSalary(Employee employee){
        return employee.getSalary()+100000.0;
    }

    public Double getNewSalaryNonStatic(Employee employee){
        return employee.getSalary()+100000.0;
    }

    public static void main(String args[]){
        Consumer<String> consumer = System.out::println;
        consumer.accept("TEST");

        Function<Employee,Double> function= Employee::getSalary;
        Employee employee = new Employee(1,"TestName",200000.0);
        System.out.println(function.apply(employee));

        //static method reference
        Stream<Employee> employeeStream= Stream.of(employee);
        employeeStream.map( MethodReferenceDemo::getNewSalary).forEach(System.out::println);

        //Instance method of a particular object
        Stream<Employee> employeeStream2= Stream.of(employee);
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
        employeeStream2.map(methodReferenceDemo::getNewSalaryNonStatic).forEach(System.out::println);

        //Instance method of an arbitrary object
        Employee employee2 = new Employee(1,"TestName2",300000.0);
        Employee employee3 = new Employee(1,"TestName3",400000.0);
        Stream<Employee> employeeStream1 = Stream.of(employee,employee2,employee3);
        System.out.println(employeeStream1.mapToDouble(Employee::getSalary).sum());

        //Constructor references //use new keyword instead of static method name
        List<String> empNames = new ArrayList<>();
        empNames.add("raman");
        empNames.add("pallav");
        empNames.add("rRomit");
        empNames.stream().map(Employee::new).map(Employee::getName).forEach(System.out::println);

    }
}
