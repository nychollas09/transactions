package br.com.transactions.service;

import java.util.UUID;
import br.com.transactions.domain.model.SummarySale;
import br.com.transactions.resource.SummarySaleResource;

public interface SummarySaleService {
  SummarySaleResource findByNumberSummarySale(String number);

  SummarySale save(SummarySaleResource summarySaleDTO);

  void rollback(UUID uuid);
}
