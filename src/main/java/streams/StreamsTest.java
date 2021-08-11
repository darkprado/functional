package main.java.streams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsTest {

//    Write a method using Stream API to check the input number is prime or not.
//    Let's agree that input value is always greater than 1 (i.e. 2, 3, 4, 5, ....).
//    Use the provided template for your method.
//
//    A prime number is a value greater than 1 that has no positive divisors other than 1 and itself.
//    See https://en.wikipedia.org/wiki/Prime_number

    public static boolean isPrime(final long number) {
        return LongStream.rangeClosed(2, number - 1).noneMatch(val -> number % val == 0);
    }

//    Create a stream that will detect bad words in a text according to a bad words list.
//    All words in the text are divided by whitespaces (always only one whitespace between two words).
//
//    After calling collect(Collectors.toList()) the stream must return the list of bad words which were found in the text.
//    The result should be dictionary ordered (in lexicographical order, i.e. sorted) and bad words shouldn't repeat.

    public static Stream<String> createBadWordsDetectingStream(String text, List<String> badWords) {
        return badWords.stream().filter(text::contains).distinct().sorted();
    }

//    You have two IntStream. The first stream contains even numbers and the second stream contains odd numbers.
//    Create the third stream that contains numbers from both streams which is divisible by 3 and 5.
//    After calling collect(Collectors.toList()) the stream should return sorted list (ascending) of these numbers.
//    Two first suitable numbers in the sorted list must be skipped.

    public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(evenStream, oddStream).filter(x -> x % 3 == 0 && x % 5 == 0).sorted().skip(2);
    }

}
