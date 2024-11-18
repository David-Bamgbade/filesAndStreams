package Chapter15;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (name, secondName) -> name.length() + secondName.length();
        System.out.println(biFunction.apply("John", "Smith"));
    }

}
