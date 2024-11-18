package Chapter15;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate <String> predicate = (x)-> {
            System.out.println("x: " + x);
            return false;
        };
        predicate.test("hello");
    }
}
