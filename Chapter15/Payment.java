package Chapter15;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.time.LocalDate;

public class Payment {


    public static void main(String[] args) {


    }


    ObjectMapper objectMapper = new ObjectMapper();
    String location = "C:\\Users\\dell\\OneDrive\\Desktop\\untitled\\Chapter15\\NewTransaction.json";

    {

        try {
            DeserializeTransaction payment = objectMapper.readValue(location, DeserializeTransaction.class);
            System.out.println(payment);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


//    public void setSender(String sender) {
//        this.sender = sender;
//    }
//
//    public String getSender() {
//        return sender;
//    }
//
//    public void setRecipient(String recipient) {
//        this.recipient = recipient;
//    }
//
//    public String getRecipient() {
//        return recipient;
//    }
//
//    public void setAmount(double amount) {
//        this.amount = amount;
//    }
//
//    public double getAmount() {
//        return amount;
//    }

//    public void setDate(LocalDate date) {
//        this.date = date;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }

//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public long getId() {
//        return id;
//    }


    }
}