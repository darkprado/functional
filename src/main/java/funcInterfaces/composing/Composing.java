package main.java.funcInterfaces.composing;

import java.util.List;
import java.util.function.IntPredicate;

public class Composing {

//    Write the disjunctAll method that accepts a list of IntPredicate's and returns a single IntPredicate.
//    The result predicate is a disjunction of all input predicates.
//
//    If the input list is empty then the result predicate should return false for any integer value (always false).

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        if (predicates.isEmpty()) {
            return i -> false;
        } else {
            IntPredicate intPredicate = predicates.get(0);
            for (int i = 1; i < predicates.size(); i++) {
                intPredicate = intPredicate.or(predicates.get(i));
            }
            return intPredicate;
        }
    }

}
