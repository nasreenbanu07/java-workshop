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
        names.stream();
        filternames -> names.startsWith("S") || name.startsWith("S");
        
        System.out.println("number of names starting with 's':" +names);
}
}
