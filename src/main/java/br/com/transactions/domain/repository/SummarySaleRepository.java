package br.com.transactions.domain.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.transactions.domain.model.SummarySale;

public interface SummarySaleRepository extends JpaRepository<SummarySale, UUID> {
  Optional<SummarySale> findByNumberSummarySale(Long numberSummarySale);
}
