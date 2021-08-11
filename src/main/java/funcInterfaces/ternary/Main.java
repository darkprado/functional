package main.java.funcInterfaces.ternary;

import java.util.Objects;

public class Main {

//    You need to write your own functional interface (TernaryIntPredicate) and use it with a lambda expression.
//    The interface must have a single non-static (and non-default) method test with three int arguments
//    that returns boolean value.
//
//    Besides, you need to write a lambda expression with three int arguments using your TernaryIntPredicate.
//
//    The lambda expression has to return true if all passed values are different otherwise false.
//    The name of the instance is allValuesAreDifferentPredicate. It should be a static field.

    public static void main(String[] args) {
        final TernaryIntPredicate allValuesAreDifferentPredicate = (a, b, c) -> {
            if (!Objects.equals(a, b) && !Objects.equals(a, c)) {
                return !Objects.equals(b, c);
            }
            return false;
        };
    }

}
