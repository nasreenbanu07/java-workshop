package com.vetias.java.workshop.Lambda;

public class SquareTest {
    private static final char[] square = new char[10]; // Example initialization
    private static final String Assert = null;

    public static void main(String[] args) { 
        Object x;
         x = new Object() {
            int findSquare(int n) {
                return n * n;
            }
         };
        Square.square=(x) {
            System.out.println(square);
            Assert.assertEquals(36, square.findSquare(6));
        
        }
    }
}



