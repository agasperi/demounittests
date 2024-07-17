package com.globalr.demounittests.deposito;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepositoRepository extends MongoRepository<DepositoRequestDTO, String> {
}
