package br.com.transactions.service;

import br.com.transactions.domain.model.SummarySale;
import br.com.transactions.resource.SummarySaleResource;
import br.com.transactions.service.exception.SummarySaleExistException;

public interface SummarySaleService {
  SummarySaleResource findByNumberSummarySale(String number);

  SummarySale save(SummarySaleResource summarySaleDTO) throws SummarySaleExistException;

}
