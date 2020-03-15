package br.com.transactions.service;

import java.util.List;
import br.com.transactions.dto.TransactionDataTransferObject;

public interface TransactionService {
  void save(TransactionDataTransferObject requestDTO);

  List<TransactionDataTransferObject> findAll();
}
