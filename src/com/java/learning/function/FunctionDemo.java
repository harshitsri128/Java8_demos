package com.java.learning.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionDemo {
    public static void main(String args[]){
        Function<String,Integer> function = str-> str.length();
        System.out.println(function.apply("Harshit"));

        Function<String,String> f1 = str -> str.toLowerCase();
        Function<String,String> f2 = str-> "Hello " + str;

        System.out.println(f1.compose(f2).apply("Harshit"));

        System.out.println(f1.andThen(f2).apply("Harshit"));

        BiFunction<String,String,String> biFunction = (str1,str2)->"Hello "+str1+" "+str2;
        System.out.println(biFunction.apply("Harshit","Srivastava"));

        UnaryOperator<String> operator = str -> "Test "+str;
        System.out.println(operator.apply("Unary"));

        Person person1 = new Person("Alex", 23);
        Person person2 = new Person("Daniel", 56);
        BinaryOperator<Person> binaryOperator = (p1,p2)-> {
          p1.name=p2.name;
          p1.age=p2.age;
          return p1;
        };
        binaryOperator.apply(person1,person2);
        System.out.println("Person Name: " + person1.getName() + " Person Age: " + person1.getAge());


    }

}