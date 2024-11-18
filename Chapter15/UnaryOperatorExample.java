package Chapter15;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator <String> operator = (x)-> String.valueOf(x.length());
        System.out.println(operator.apply("Hello"));
    }
}
