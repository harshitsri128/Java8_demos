package com.java.learning.streams;

import com.java.learning.supplier.Employee;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalDemo {

    public static String getDefault(){
        return "This is default";
    }
    public static void main(String args[]){
        Map<Integer, Employee> map=new HashMap<>();

        Optional<Employee> optionalEmployee= Optional.ofNullable(map.get(12));
        if(optionalEmployee.isPresent())
            System.out.println("Valid");
        else
            System.out.println("Invalid");
        //orElse(T other)#
        optionalEmployee.orElse(new Employee("DEMo"));

        map.put(1,new Employee(1,"test",200000.0));
        optionalEmployee= Optional.ofNullable(map.get(1));
        //if present
        optionalEmployee.ifPresent(employee -> System.out.println(employee.getName()));


        if(optionalEmployee.isPresent())
            System.out.println(optionalEmployee.get().getSalary());

        //Optional<T> filter(Predicate<? super T> predicate)
        Optional<String> fruit = Optional.ofNullable("Grapes");
        System.out.println(fruit.filter(f->f.length() ==6));

        //map(Function<? super T, ? extends U> mapper)#
        Optional<Employee> opt = Optional.of(new Employee(1,"Check",20000));
        opt.map(emp ->emp.getSalary()).filter(sal ->sal >100000).ifPresent(System.out::println);

        //orElseGet(Supplier<? extends T> other)
        Optional<String> optional=Optional.ofNullable(null);
        System.out.println(optional.orElseGet(OptionalDemo::getDefault));

        //orElseThrow(Supplier<? extends T> other)
        try{
            System.out.println(optional.orElseThrow(() -> new Exception("Not found")));
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
