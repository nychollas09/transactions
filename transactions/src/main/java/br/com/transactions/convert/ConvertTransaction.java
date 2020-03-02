package br.com.transactions.convert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import br.com.transactions.domain.model.SummarySale;
import br.com.transactions.domain.model.Transaction;
import br.com.transactions.domain.utils.CardHolder;
import br.com.transactions.domain.utils.TransactionType;
import br.com.transactions.dto.TransactionDataTransferObject;

public final class ConvertTransaction {

  public static List<Transaction> convert(TransactionDataTransferObject resource,
      SummarySale summarySale) {
    List<Transaction> transactions = new ArrayList<>();

    long nsu = new Random().nextLong();
    int total = Integer.parseInt(resource.getCountInstallments());

    BigDecimal grossAmount =
        summarySale.getGrossAmountSale().divide(BigDecimal.valueOf(total).setScale(0));

    BigDecimal netAmount =
        summarySale.getNetAmountSale().divide(BigDecimal.valueOf(total).setScale(0));

    int installmentNumber = 1;
    for (int count = 0; count < total; count++) {
      Transaction transaction = new Transaction(String.valueOf(nsu),
          TransactionType.getTransactionType(resource.getTypeTransaction()), grossAmount, netAmount,
          Short.parseShort(String.valueOf(installmentNumber + count)),
          Short.parseShort(String.valueOf(total)), resource.getMerchantCode(),
          CardHolder.getCardHolder(resource.getHolder()), resource.getMaskedCreditCardNumber(),
          LocalDateTime.parse(resource.getCapturedAt()), LocalDate.parse(resource.getPaymentDate()),
          summarySale);
      transactions.add(transaction);

    }

    return transactions;
  }
}
