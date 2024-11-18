package Chapter15;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

public class WebSrapping {
    public static void main(String[] args) {
        String locator = "https://www.coursera.org/learn/foundations-of-cybersecurity/lecture/8matF/introduction-to-cybersecurity";
        URI uri = URI.create(locator);
        try(InputStream inputStream = uri.toURL().openStream()) {
            System.out.println(new String(inputStream.readAllBytes()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
}
}
