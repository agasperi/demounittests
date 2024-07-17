package com.globalr.demounittests.deposito;

import lombok.Data;

@Data
public class DepositoResposeDTO {

    private String idCuenta;
    private Double saldoAnterior;
    private Double saldoNuevo;

}
