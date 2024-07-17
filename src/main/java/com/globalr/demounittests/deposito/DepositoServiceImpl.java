package com.globalr.demounittests.deposito;

import com.globalr.demounittests.Cuenta.CuentaDAO;
import com.globalr.demounittests.Cuenta.CuentaRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class DepositoServiceImpl implements DepositoService{

    private final CuentaRepository cuentaRepository;

    @Override
    public DepositoResposeDTO crearDeposito(DepositoRequestDTO depositoRequestDTO) {
        DepositoResposeDTO resultado = new DepositoResposeDTO();
        Optional<CuentaDAO> cuenta = cuentaRepository.findById(depositoRequestDTO.getIdCuenta());

        cuenta.ifPresentOrElse(c -> {
            double monto = depositoRequestDTO.getMontoADepositar();
            double nuevoSaldo = c.getSaldo() + monto;
            resultado.setIdCuenta(c.getIdCuenta());
            resultado.setSaldoAnterior(c.getSaldo());
            resultado.setSaldoNuevo(nuevoSaldo);
        }, () -> {
            throw new DepositException("Cuenta no encontrada");
        });

        return resultado;
    }
}
