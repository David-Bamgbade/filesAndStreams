package Chapter15;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<Integer, Double> function = (x)->
            Double.valueOf(String.valueOf(x * x));

        double result = function.apply(10);
        System.out.println(result);
    }
}
