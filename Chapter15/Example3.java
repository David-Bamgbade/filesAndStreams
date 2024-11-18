package Chapter15;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\dell\\OneDrive\\Desktop\\untitled\\Chapter15";

        ObjectMapper mapper = new ObjectMapper();

        try (FileInputStream fileStream = new FileInputStream(fileName)) {
            Dog animal = mapper.readValue(fileStream, Dog.class);
            System.out.println("name: " + animal.getName() + "\n" + "age: " + animal.getAge());
        } catch (IOException exception) {
            exception.printStackTrace();
        }





    }


}
