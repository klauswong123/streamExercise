package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().reduce(0,(lastOddNumber,number) -> number%2==1?number:lastOddNumber);
    }

    public String getLongest(List<String> words) {
        return words.stream().reduce("",(longestWord, word) -> word.length()>longestWord.length()?word:longestWord);
    }

    public int getTotalLength(List<String> words) {
        return words.stream().reduce("", (completeString, word) -> completeString+=word).length();
    }
}
