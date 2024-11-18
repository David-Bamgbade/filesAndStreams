package Chapter15;

import java.io.InputStream;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.IntStream;


public class SupplierSample {
    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "Titans";
        System.out.println(supplier.get());

        System.out.println(IntStream.rangeClosed(1, 10).sum());
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);

        Map<String, Integer> map = Map.of(
                 "QWERTY",  5,
                 "Hello", 6
        );


    }
}
