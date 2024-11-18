package Chapter15;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<Integer, String> biConsumer = (x, y)->{
            System.out.printf("Transaction{\n\t id: %d\n name: %s", x, y);
        };
        biConsumer.accept(1, "John");
    }
}
