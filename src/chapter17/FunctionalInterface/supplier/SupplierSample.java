package chapter17.FunctionalInterface.supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()-> new Random().nextInt();
        System.out.println(supplier.get());

        Stream.generate(supplier)
                .forEach(System.out::println);
    }
}
