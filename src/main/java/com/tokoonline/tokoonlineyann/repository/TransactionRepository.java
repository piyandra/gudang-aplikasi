package com.tokoonline.tokoonlineyann.repository;

import com.tokoonline.tokoonlineyann.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
