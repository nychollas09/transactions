package br.com.transactions.service;

import br.com.transactions.dto.TransactionDataTransferObject;

public interface TransactionService {
  void save(TransactionDataTransferObject requestDTO);
}
