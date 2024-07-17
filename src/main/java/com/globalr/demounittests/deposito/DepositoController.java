package com.globalr.demounittests.deposito;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deposito")
public class DepositoController {

    @PostMapping("/{idaccount}")
    public DepositoResposeDTO realizarDeposito(@RequestBody DepositoRequestDTO depositoRequestDTO) {
        return null;
    }

}
