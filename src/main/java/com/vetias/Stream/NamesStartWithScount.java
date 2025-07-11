package com.vetias.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Stream;

public class NamesStartWithScount {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("jemc");
        names.add("nasreen");
        names.add("aarish");
        names.add("anuroopa");
        names.add("sachin");
        names.add("nara");
        names.add("shakthi");
        names.add("sarvesh");
        names.stream()
            .filter(name -> name.startsWith("s") || name.startsWith("S"))
            .distinct()
            .map(String::toUpperCase)
            .forEach(System.out::println);

        long count = names.stream()
            .filter(name -> name.startsWith("s") || name.startsWith("S"))
            .count();
    
        System.out.println("number of names starting with 's': " + count);




        System.out.println("number of names starting with 's':" +names);
}
}

