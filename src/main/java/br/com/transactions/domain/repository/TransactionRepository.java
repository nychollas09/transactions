package br.com.transactions.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.transactions.domain.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
