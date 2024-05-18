package chapter17.FunctionalInterface.doubleToIntFunction;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionSample {
    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (number) -> (int) number;
        System.out.println(doubleToIntFunction.applyAsInt(10.0));
    }
}
