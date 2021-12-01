package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().reduce(0,(lastOddNumber,number) -> number%2==1?number:lastOddNumber);
    }

    public String getLongest(List<String> words) {
        return null;
    }

    public int getTotalLength(List<String> words) {
        return 0;
    }
}
