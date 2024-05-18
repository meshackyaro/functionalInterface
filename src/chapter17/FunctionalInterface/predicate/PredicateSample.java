package chapter17.FunctionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Boolean> predicate = (word)-> {
            return word;
        };
        System.out.println(true);
    }
}
