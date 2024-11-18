package Chapter15;

public class Car implements Vehicle{
    @Override
    public void accelerate(int speed) {
        System.out.println("Im a car accelerating at " + speed + "km/hrs");
    }

    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.accelerate(10);
    }
}
