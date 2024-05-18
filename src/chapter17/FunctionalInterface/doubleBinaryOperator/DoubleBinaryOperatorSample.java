package chapter17.FunctionalInterface.doubleBinaryOperator;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorSample {
    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator = (number1, number2) -> number1 * number2;
        System.out.println(doubleBinaryOperator.applyAsDouble(5.23, 2));
    }
}
