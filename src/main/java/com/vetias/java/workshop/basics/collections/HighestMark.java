package com.vetias.java.workshop.basics.collections;

public class HighestMark {

    public static void main(String[] args) {
        int[] marks = {85,80,78,69,90,75};
        int HighestMark = marks[0];
        for (int i = 1; i <marks.length; i++) {
            if (marks[i] > HighestMark) {
                HighestMark = marks[i];
            // print the highest mark{
                System.out.println(("highest mark is:" + HighestMark));
            }

            }

        }
    }

