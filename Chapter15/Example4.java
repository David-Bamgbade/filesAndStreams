package Chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example4 {
    public static void main(String[] args) {
        //Creating A Destination
        PrintStream destination = System.out;
        String text = "How Far My Guy";
        destination.println(text);

        //write To A file
        try(FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\dell\\OneDrive\\Desktop\\untitled\\Chapter15\\text.txt")){
          byte[] bytes = text.getBytes();
           fileOutput.write(bytes);
       }catch (IOException exception){

       }

//        //new way to write to file
//        String location = "C:\\Users\\dell\\OneDrive\\Desktop\\untitled\\Chapter15\\text.txt\\";
//        Path path = Path.of(location);
//        try (OutputStream outStream = Files.newOutputStream(path)){
//
//        }







    }
}
