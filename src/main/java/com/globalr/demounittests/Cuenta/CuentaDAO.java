package com.globalr.demounittests.Cuenta;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//@Entity
@Document(collection = "account")
public class CuentaDAO {

    @Id
    private String idCuenta;

    private Double saldo;

}
