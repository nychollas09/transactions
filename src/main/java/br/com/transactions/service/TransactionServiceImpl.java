package br.com.transactions.service;

import java.util.List;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.transactions.convert.ConvertTransaction;
import br.com.transactions.domain.model.SummarySale;
import br.com.transactions.domain.model.Transaction;
import br.com.transactions.domain.repository.TransactionRepository;
import br.com.transactions.dto.TransactionDataTransferObject;
import br.com.transactions.resource.SummarySaleResource;

@Service
public class TransactionServiceImpl implements TransactionService { 

  private static final Logger LOG = Logger.getLogger(TransactionServiceImpl.class);

  @Autowired
  private TransactionRepository transactionRepository;

  @Autowired
  private SummarySaleServiceImpl componentSummarySale;

  @Override
  public void save(TransactionDataTransferObject requestDTO) {
    SummarySaleResource summarySaleDTO = requestDTO.getSummarySale();
    SummarySale summarySale = componentSummarySale.save(summarySaleDTO);
    try {

      List<Transaction> transactions = ConvertTransaction.convert(requestDTO, summarySale);

      LOG.info("Saving count transactions [" + transactions.size() + "]");
      transactionRepository.saveAll(transactions);

    } catch (Exception e) {
      LOG.error("Error trying to persist transactions", e.getMessage(), e);
    }

  }
}
