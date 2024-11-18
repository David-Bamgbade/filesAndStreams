package Chapter15;

@FunctionalInterface
public interface Vehicle {
    void accelerate(int speed);
    default void brake() {
        System.out.println("reducing speed");
    }
}
