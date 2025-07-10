package com.vetias.java.workshop.basics.collections;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main (String[] args) {
        List<String> names = new ArrayList<>();
        names.add("nasreen");
        names.add("anuroopa");
        names.add("jemc");
        names.add("shakthi");
        names.add("nara");

        System.out.println(names);
        for (int i = 0;i< names.size();i++) {
            System.out.println((names.get(i)));
        }



    }


}
