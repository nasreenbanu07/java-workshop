package com.vetias.Stream;

public class AscendingDecendingOrder {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 4};

        // Ascending order
        System.out.println("Ascending Order:");
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Decending order
        System.out.println("Decending Order:");
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        
        
    }

}
