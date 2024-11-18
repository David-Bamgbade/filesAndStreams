package Chapter15;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> {
            return a < b;
        };

        System.out.println(biPredicate.test(1, 2));
    }
}
