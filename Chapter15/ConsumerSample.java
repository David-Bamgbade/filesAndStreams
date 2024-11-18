package Chapter15;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
     //The consumer interface takes something and returns nothing
        Consumer<String> consumer = (text) -> System.out.println("Your Text Has " + text.length() + " characters");
        consumer.accept("World");
        List<String> words =
                List.of("Titans", "Tech blazers",
                        "Byte builders", "Dynamites", "LightHouse"
                        );
        words.forEach(consumer);
    }
}
