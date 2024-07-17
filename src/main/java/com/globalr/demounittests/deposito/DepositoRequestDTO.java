package com.globalr.demounittests.deposito;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DepositoRequestDTO {

    @Id
    private String idDeposito;

    private String idCuenta;
    private Double montoADepositar;

}
