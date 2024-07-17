package com.globalr.demounittests.deposito;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deposito")
@RequiredArgsConstructor
public class DepositoController {

    private final DepositoService service;

    @PostMapping()
    public DepositoResposeDTO realizarDeposito(@RequestBody DepositoRequestDTO depositoRequestDTO) {
        return service.crearDeposito(depositoRequestDTO);
    }

}
