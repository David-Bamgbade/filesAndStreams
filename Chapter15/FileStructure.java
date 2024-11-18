package Chapter15;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;

public class FileStructure {
    public static void main(String[] args) {
//        String pathLocation = "do/it/like/this/david.java";
//        Path location = Path.of(pathLocation);
//        System.out.println(location);

        String pathVariable = "C:\\Users\\dell\\OneDrive\\Desktop\\david.java";
        Path location2 = Path.of(pathVariable);

        File folder = new File(location2.toString());
        try {
            folder.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        folder.delete();

        System.out.println(folder);

        System.out.println(folder.length());

        //in, out, err
        System.out.println("Enter data: ");
        try(InputStream inputStream = new DataInputStream(System.in)){
            byte[] data = inputStream.readNBytes(10);
            System.out.println(Arrays.toString(data));
        }catch (IOException ex){
            throw new UncheckedIOException(ex);
        }



    }





}
