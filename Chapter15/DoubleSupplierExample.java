package Chapter15;

import java.util.Random;
import java.util.function.DoubleSupplier;

public class DoubleSupplierExample {
    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = () -> new Random().nextDouble();
        System.out.println(doubleSupplier.getAsDouble());
    }
}
