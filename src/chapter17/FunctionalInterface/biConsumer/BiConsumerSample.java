package chapter17.FunctionalInterface.biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (firstName, surname) -> {
            System.out.println(firstName +" "+ surname);
        };
        biConsumer.accept("John", "Doe");

        BiConsumer<Integer, String> biConsumer1 = (number, name) -> System.out.println(number + " Johnny Walker is good for " + name);
        biConsumer1.accept(1, "John");

    }

}
