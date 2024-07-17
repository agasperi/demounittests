package com.globalr.demounittests.deposito;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositoRepository extends JpaRepository<DepositoRequestDTO, String> {
}
