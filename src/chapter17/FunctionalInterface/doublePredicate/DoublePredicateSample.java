package chapter17.FunctionalInterface.doublePredicate;

import java.util.function.DoublePredicate;

public class DoublePredicateSample {
    public static void main(String[] args) {
        DoublePredicate doublePredicate = (number) -> number % 2 == 0;
        System.out.println(doublePredicate.test(4.2));
    }
}
