package chapter17.FunctionalInterface.doubleConsumer;

import java.util.function.DoubleConsumer;

public class DoubleConsumerSample {
    public static void main(String[] args) {
        DoubleConsumer consumer = (number) -> {
            System.out.println(number);
        };
        consumer.accept(1.0);
    }
}
