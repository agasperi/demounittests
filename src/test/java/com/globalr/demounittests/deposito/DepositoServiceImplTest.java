package com.globalr.demounittests.deposito;

import com.globalr.demounittests.Cuenta.CuentaDAO;
import com.globalr.demounittests.Cuenta.CuentaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DepositoServiceImplTest {

    @InjectMocks
    DepositoServiceImpl service;

    @Mock
    CuentaRepository cuentaRepository;

    @Test
    public void crearDeposito_Exitoso ()
    {
        // Preparacion de los datos de prueba
        DepositoRequestDTO depositoRequestDTO = new DepositoRequestDTO();
        depositoRequestDTO.setIdDeposito("12345");
        depositoRequestDTO.setIdCuenta("09876");
        depositoRequestDTO.setMontoADepositar(30.0);

        CuentaDAO cuentaDAOMock = new CuentaDAO();
        cuentaDAOMock.setIdCuenta("09876");
        cuentaDAOMock.setSaldo(100.0);
        Optional<CuentaDAO> cuentaMock = Optional.of(cuentaDAOMock);

        // Ejecutar prueba
        when(cuentaRepository.findById(depositoRequestDTO.getIdCuenta())).thenReturn(cuentaMock);
        DepositoResposeDTO resultado = service.crearDeposito(depositoRequestDTO);

        // Realizar las comprobaciones
        assertNotNull(resultado);
        assertEquals("09876", resultado.getIdCuenta());
        assertEquals(100.0, resultado.getSaldoAnterior());
        assertEquals(130.0, resultado.getSaldoNuevo());
    }

    @Test
    public void crearDeposito_Exception ()
    {
        // Preparacion de los datos de prueba
        DepositoRequestDTO depositoRequestDTO = new DepositoRequestDTO();
        depositoRequestDTO.setIdDeposito("12345");
        depositoRequestDTO.setIdCuenta("09876");
        depositoRequestDTO.setMontoADepositar(30.0);

        Optional<CuentaDAO> cuentaMock = Optional.empty();

        // Ejecutar prueba
        when(cuentaRepository.findById(depositoRequestDTO.getIdCuenta())).thenReturn(cuentaMock);
        assertThrows(RuntimeException.class, () -> {
            service.crearDeposito(depositoRequestDTO);
        });

    }

}
