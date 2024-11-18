package Chapter15;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private int id;
    private String companyName;
    private BigDecimal companyAsset;
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDateTime createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BigDecimal getCompanyAsset() {
        return companyAsset;
    }

    public void setCompanyAsset(BigDecimal companyAsset) {
        this.companyAsset = companyAsset;
    }


   public void setCreatedAt(LocalDateTime now) {
        this.createdAt = now;
   }

   public LocalDateTime getCreatedAt() {
        return createdAt;
   }


    public static void main(String[] args) {

    }

}
