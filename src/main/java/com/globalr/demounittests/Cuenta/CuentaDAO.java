package com.globalr.demounittests.Cuenta;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CuentaDAO {

    @Id
    private String idCuenta;

    private Double saldo;

}
