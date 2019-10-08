package com.java.programs.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Object> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Poornima"); //String value
        linkedHashSet.add(12345); // integer value
        linkedHashSet.add(Boolean.TRUE); // Boolean value

        for (Object value : linkedHashSet) {
            System.out.println(value);
        }

        //in java8
        linkedHashSet.forEach(System.out::println);
    }
}
