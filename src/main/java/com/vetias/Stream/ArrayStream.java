package com.vetias.Stream;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {
    
    public static void main(String[] args) {
        int[] marks = {90,90,78,67,68};
        long numberofSubjectsPassed = Arrays.stream(marks)
            .filter(mark -> mark > 40)
            .count();
        System.out.println(numberofSubjectsPassed);

        IntStream markStream = Arrays.stream(marks);
        numberofSubjectsPassed = markStream
        .filter(mark -> mark > 40). count();
        System.out.println(("number of subjects passed:" +numberofSubjectsPassed));

    }


}
