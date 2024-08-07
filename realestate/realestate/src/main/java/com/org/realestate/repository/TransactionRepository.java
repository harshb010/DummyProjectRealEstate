package com.org.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.realestate.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
