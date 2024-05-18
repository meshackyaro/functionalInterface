package chapter17.FunctionalInterface.doubleFunction;

import java.util.function.DoubleFunction;

public class DoubleFunctionSample {
    public static void main(String[] args) {
        DoubleFunction<Integer> doubleFunction = (number) -> (int) number;
        System.out.println( doubleFunction.apply(4.3));

    }
}
