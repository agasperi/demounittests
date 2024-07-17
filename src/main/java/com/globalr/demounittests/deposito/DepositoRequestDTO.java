package com.globalr.demounittests.deposito;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//@Entity
@Document(collection = "deposit")
public class DepositoRequestDTO {

    @Id
    private String idDeposito;

    private String idCuenta;
    private Double montoADepositar;

}
