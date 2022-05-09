package com.java.learning.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService {

    public static List<Person> getPersons(List<Person> persons) {
        Collections.sort(persons,(p1,p2) ->{

                return p1.getName().compareTo(p2.getName());

        });
        return persons;
    }
}
