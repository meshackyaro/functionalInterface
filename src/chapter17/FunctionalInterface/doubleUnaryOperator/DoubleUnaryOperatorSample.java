package chapter17.FunctionalInterface.doubleUnaryOperator;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorSample {
    public static void main(String[] args) {
        DoubleUnaryOperator doubleUnaryOperator = (number) -> number * 2;
        System.out.println(doubleUnaryOperator.applyAsDouble(2.0));
    }
}
