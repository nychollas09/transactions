package br.com.transactions.service;

import br.com.transactions.dto.SummarySaleDataTransferObject;

public interface SummarySaleService {
  SummarySaleDataTransferObject findByNumberSummarySale(String number);

  SummarySaleDataTransferObject save(SummarySaleDataTransferObject summarySaleDTO);

}
