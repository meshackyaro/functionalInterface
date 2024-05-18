package chapter17.FunctionalInterface.biFunction;


import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction = (word, number) -> word.length()==number;

        Boolean result = biFunction.apply("hello", 5);
        System.out.println(result);

        BiFunction<String, String, Boolean> biFunction1 = String::equals;
        Boolean result1 = biFunction1.apply("hello", "hello");
        System.out.println(result1);

        BiFunction<Integer, Integer, Boolean> biFunction2 = Integer::equals;
        Boolean result2 = biFunction2.apply(5, 1);
        System.out.println(result2);
    }
}
