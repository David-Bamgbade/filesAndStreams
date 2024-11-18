package Chapter15;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transactions {

    public static void addTransaction() {
        List<Transaction> transactions = new ArrayList<Transaction>();
        Transaction transacts = new Transaction();
        transacts.setId(2);
        transacts.setCompanyAsset(new BigDecimal(10000));
        transacts.setCompanyName("Alphabet");
//        transacts.setCreatedAt(LocalDateTime.now());
        transactions.add(transacts);
        addFile(transactions);
    }

    public static void addFile(List<Transaction> transactions) {
        String location = "C:\\Users\\dell\\OneDrive\\Desktop\\untitled\\Chapter15\\Transactions.json";
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
       try(FileWriter filewriter = new FileWriter(location)) {
           mapper.writeValue(filewriter, transactions);
       }catch (IOException e) {
           e.printStackTrace();
       }
    }







    public static void main(String[] args) {
        addTransaction();
    }



}
