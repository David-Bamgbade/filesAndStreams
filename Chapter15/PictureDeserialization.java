package Chapter15;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PictureDeserialization {


    public static void main(String[] args) {
        String location = "C:\\Users\\dell\\OneDrive\\Desktop\\untitled\\Chapter15\\Pictures.json";
        ObjectMapper mapper = new ObjectMapper();

        try(FileReader  fileReader = new FileReader(location)) {
            List<Picture> pictureList = new ArrayList<>();
            mapper.readValue(fileReader, new TypeReference<List<Picture>>(){});

            for (Picture picture : pictureList) {
                if(picture.getId() % 3 == 0){
                    System.out.println(picture.getId());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
