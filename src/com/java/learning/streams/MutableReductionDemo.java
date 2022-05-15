package com.java.learning.streams;

import com.java.learning.supplier.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MutableReductionDemo {
    public static void main(String ar[]){

        //1. Optional<T> reduce(BinaryOperator<T> accumulator)
        List<Employee> employeeList =  new ArrayList<>();
        employeeList.add(new Employee(1, "Emp1",200000.0));
        employeeList.add(new Employee(2, "Emp2",300000.0));
        employeeList.add(new Employee(3, "Emp3",400000.0));
        employeeList.add(new Employee(4, "Emp4",800000.0));
        employeeList.add(new Employee(5, "Emp5",600000.0));

        Optional<Double> totalSalary = employeeList.stream().map(employee -> employee.getSalary()).reduce((p, q) -> p+q);
        if(totalSalary.isPresent())
            System.out.println(totalSalary.get());

        //employeeList.add(new Employee(1, "Emp1",200000.0));

        System.out.println(employeeList.stream().map(employee -> employee.getSalary())
                .reduce(100000.0,(p,q)->p+q));

        //3. <U> U reduce(U identity, BiFunction<U, ? super T,U> accumulator, BinaryOperator<U> combiner)#
        Double totalSal = employeeList.parallelStream()
                .map(employee -> employee.getSalary())
                .reduce(200000.0,(p,q)->p+q);
        System.out.println(totalSal);

        //4. max() and min()#
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Optional<Integer> opt  = list.stream().max(Comparator.naturalOrder());
        Optional<Integer> opt2  = list.stream().min(Comparator.naturalOrder());

        if(opt.isPresent() && opt2.isPresent())
            System.out.println("Max = "+opt.get()+" Min= "+opt2.get());

    }
}
