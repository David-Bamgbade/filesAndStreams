package Chapter15;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DeserializeTransaction {

    private long id;
    private String sender;
    private String recipient;
    private double amount;


    @Override
    public String toString () {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }





    public static void main(String[] args) throws IOException {
//        String location = "C:\\Users\\dell\\OneDrive\\Desktop\\untitled\\Chapter15\\NewTransaction.json";
//        ObjectMapper mapper = new ObjectMapper();
//
//        File file = new File(location);
//
//       Payment deserializePayment = mapper.readValue(new File(String.valueOf(file)), Payment.class);
//
//       deserializePayment.getId();
//       deserializePayment.getAmount();
//       deserializePayment.getSender();
//       deserializePayment.getRecipient();
//
//      System.out.println(deserializePayment.getId() + deserializePayment.getAmount() + deserializePayment.getSender() + deserializePayment.getRecipient());
//
//
//        String json = "C:\\Users\\dell\\OneDrive\\Desktop\\untitled\\Chapter15//NewTransaction.json";
//
//        ObjectMapper mapper = new ObjectMapper();

//        try {
//
//
//        }











//     deserializePayment.setDate(LocalDate.now());




//        try(FileReader = new FileReader(location)) {
//            List<Payment> listOfPayment = new ArrayList<Payment>();
//        }catch (IOException e) {
//            e.printStackTrace();
//        }




    }
}
