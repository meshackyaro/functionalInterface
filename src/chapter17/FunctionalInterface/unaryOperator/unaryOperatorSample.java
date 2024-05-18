package chapter17.FunctionalInterface.unaryOperator;

import java.util.function.UnaryOperator;

public class unaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (John)-> John+" Doe";
        System.out.println(unaryOperator.apply("John"));;

        //also;
        UnaryOperator<Integer> unaryOperator1 = (number)-> number * 20;
        System.out.println(unaryOperator1.apply(2));
    }
}
