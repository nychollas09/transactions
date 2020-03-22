package br.com.transactions.service;

import java.util.ArrayList;
import java.util.List;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;
import br.com.transactions.convert.ConvertTransaction;
import br.com.transactions.domain.model.SummarySale;
import br.com.transactions.domain.model.Transaction;
import br.com.transactions.domain.repository.SummarySaleRepository;
import br.com.transactions.domain.repository.TransactionRepository;
import br.com.transactions.dto.SummarySaleDataTransferObject;
import br.com.transactions.dto.TransactionDataTransferObject;

@Service
public class TransactionServiceImpl implements TransactionService {

  private static final Logger LOG = Logger.getLogger(TransactionServiceImpl.class);

  private TransactionRepository transactionRepository;
  private SummarySaleRepository summarySaleRepository;

  public TransactionServiceImpl(TransactionRepository transactionRepository,
      SummarySaleRepository summarySaleRepository) {
    this.transactionRepository = transactionRepository;
    this.summarySaleRepository = summarySaleRepository;
  }

  @Override
  public void save(TransactionDataTransferObject requestDTO) {
    SummarySaleDataTransferObject summarySaleDTO = requestDTO.getSummarySale();
    try {

      SummarySale summarySale = summarySaleRepository.saveAndFlush(
          new SummarySale(summarySaleDTO.getNetAmountSale(), summarySaleDTO.getGrossAmountSale(),
              summarySaleDTO.getMerchantDiscountRate(), summarySaleDTO.getNumberSummarySale()));

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
          transaction.getNumberOfInstallments().toString(), transaction.getMaskedCreditCardNumber(),
          transaction.getCapturedAt().toString(), transaction.getPaymentDate().toString());

      transactionsDTO.add(transactionDTO);
    });
    return transactionsDTO;
  }
}
