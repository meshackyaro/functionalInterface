package chapter17.FunctionalInterface.consumer;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = (word) -> {
            System.out.println("You have entered "+word);
            System.out.println("You have entered "+word);
        };
        consumer.accept("Hello");
    }
}
