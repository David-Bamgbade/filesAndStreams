package Chapter15;

import java.io.FileReader;
import java.io.IOException;

public class FileTask1 {
    public static void main(String[] args) {

        String location = "C:\\Users\\dell\\OneDrive\\Desktop\\untitled\\Chapter15";

        String filename = location.concat("output.txt");

        try (FileReader fileReader = new FileReader(filename)) {
            char[] buffer = new char[1024];
            fileReader.read(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}







