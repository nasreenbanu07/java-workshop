package com.vetias.Stream;

public class EvenOddSplitExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Split into even and odd numbers
        int[] evenNumbers = java.util.Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();

        int[] oddNumbers = java.util.Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .toArray();

        // Print the results
        System.out.println("Even Numbers: " + java.util.Arrays.toString(evenNumbers));
        System.out.println("Odd Numbers: " + java.util.Arrays.toString(oddNumbers));
    }
}
