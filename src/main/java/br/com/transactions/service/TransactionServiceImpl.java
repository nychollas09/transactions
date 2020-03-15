package br.com.transactions.service;

import java.util.ArrayList;
import java.util.List;
import org.jboss.logging.Logger;
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

  private TransactionRepository transactionRepository;
  private SummarySaleServiceImpl summarySaleService;

  public TransactionServiceImpl(TransactionRepository transactionRepository,
      SummarySaleServiceImpl summarySaleService) {
    this.transactionRepository = transactionRepository;
    this.summarySaleService = summarySaleService;
  }

  @Override
  public void save(TransactionDataTransferObject requestDTO) {
    SummarySaleResource summarySaleDTO = requestDTO.getSummarySale();
    try {
      SummarySale summarySale = summarySaleService.save(summarySaleDTO);
      List<Transaction> transactions = ConvertTransaction.convert(requestDTO, summarySale);

      LOG.info("Saving count transactions [" + transactions.size() + "]");
      transactionRepository.saveAll(transactions);

    } catch (Exception e) {
      LOG.error("Error trying to persist transactions", e.getMessage(), e);
    }

  }

  @Override
  public List<TransactionDataTransferObject> findAll() {
    List<TransactionDataTransferObject> transactionsDTO = new ArrayList<>();

    transactionRepository.findAll().stream().forEach(transaction -> {
      TransactionDataTransferObject transactionDTO = new TransactionDataTransferObject(
          transaction.getMerchantCode(), transaction.getTransactionType().name(),
          transaction.getNumberOfInstallments().toString(), transaction.getCapturedAt().toString(),
          transaction.getPaymentDate().toString());

      transactionsDTO.add(transactionDTO);
    });
    return transactionsDTO;
  }
}
