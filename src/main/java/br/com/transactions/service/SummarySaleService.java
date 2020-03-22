package br.com.transactions.service;

import java.util.List;
import br.com.transactions.dto.SummarySaleDataTransferObject;

public interface SummarySaleService {
  SummarySaleDataTransferObject findByNumberSummarySale(String number);

  SummarySaleDataTransferObject save(SummarySaleDataTransferObject summarySaleDTO);

  List<SummarySaleDataTransferObject> findAll();
}
