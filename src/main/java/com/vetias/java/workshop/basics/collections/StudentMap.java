package com.vetias.java.workshop.basics.collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1001,"nasreen");
        students.put(1002,"anuroopa");
        students.put(1003,"jemc");
        students.put(1004,"shakthi");
        students.put(1005,"nara");
        System.out.println(students);
    

    }

}
