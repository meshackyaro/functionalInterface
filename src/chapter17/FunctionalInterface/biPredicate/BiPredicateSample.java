package chapter17.FunctionalInterface.biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (firstName, lastName) -> firstName.equals(lastName);
        System.out.println(biPredicate.test("John", "Doe"));
    }
}
