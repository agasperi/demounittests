package com.globalr.demounittests.Cuenta;

//import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CuentaRepository extends MongoRepository<CuentaDAO, String> {
}
