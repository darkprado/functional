package main.java.lyambdas;

public class simpleLambdaExpressions {

//    Write a lambda expression that accepts two integers arguments and returns max of them.

//    (x, y) -> x > y ? x : y;

//    Write a lambda expression that accepts a long value and returns the next even number.

//    x -> {
//        if (++x % 2 == 0) {
//            return x;
//        }
//        return ++x;
//    };

//    Write a lambda expression that accepts seven (!) string arguments
//    and returns a string in upper case concatenated from all of them (in the order of arguments).

//    (s1, s2, s3, s4, s5, s6, s7) -> {
//        String s = s1 + s2 + s3 + s4 + s5 + s6 + s7;
//        return s.toUpperCase();
//    };

//    Write a lambda expression that accepts two long arguments as a range borders
//    and calculates (returns) production of all numbers in this range (inclusively).
//    It's guaranteed that 0 <= left border <= right border.
//    if left border == right border then the result is any border.

//    (x, y) -> {
//        long res = x;
//        if (x == y) {
//            return x;
//        }
//        for(; x < y; x++) {
//            res *= x + 1L;
//        }
//        return res;
//    };

//    Write a lambda expression that accepts a list of strings and returns new list of distinct strings (without repeating).
//    The order of elements in the result list may be any (elements will be sorted by the testing system).

//    (x) -> new ArrayList<>(new HashSet<>(x));

//    Using closure write a lambda expression that calculates a*x^2 + b*x + c where a, b, c are context final variables.
//    They will be available in the context during testing. Note, the result is double.

//    x -> a * Math.pow(x,2) + b * x + c;

//    Using closure write a lambda expression that adds prefix (before) and suffix (after) to its single string argument;
//    prefix and suffix are final variables and will be available in the context during testing.

//    string -> prefix + string.trim() + suffix;
}
