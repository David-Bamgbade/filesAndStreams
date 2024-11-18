package Chapter15;

import java.util.Comparator;

public class LamdaExample {
    public static void main(String[] args) {
        Vehicle vehicle = (speed) -> {
            System.out.println("Speed: " + speed);
        };

        vehicle.accelerate(100);

        Comparator<Dog> dogComparator = (dog1, dog2) -> {
          return dog1.getAge() - dog2.getAge();
        };

        /**
         * 1. Consumer
         * 2. BiConsumer
         * 3. Supplier
         * 4. Function
         * 5. BiFunction
         * 6. Predicate
         * 7. BiPredicate
         * 8. UnaryOperator
         * 9. BinaryOperator
         */







    }


}
