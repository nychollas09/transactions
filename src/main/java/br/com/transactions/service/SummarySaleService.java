package br.com.transactions.service;

import java.util.List;
import br.com.transactions.dto.SummarySaleDataTransferObject;

public interface SummarySaleService {
  SummarySaleDataTransferObject findByNumber(String number);

  SummarySaleDataTransferObject save(SummarySaleDataTransferObject summarySaleDTO,
      Integer numberOfInstallments);

  List<SummarySaleDataTransferObject> findAll();

  List<SummarySaleDataTransferObject> findByNumberOfInstallments(String numberOfInstallments);
}
