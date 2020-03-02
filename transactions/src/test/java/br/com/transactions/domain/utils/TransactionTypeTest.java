package br.com.transactions.domain.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.transactions.domain.utils.exception.TransactionTypeNotFoundException;

@SpringBootTest
@ActiveProfiles("test")
public class TransactionTypeTest {

    @Test
    public void shouldReturnTransactionType() {
        TransactionType payment = TransactionType.getTransactionType("payment");
        TransactionType credit = TransactionType.getTransactionType("credit");
        TransactionType debit = TransactionType.getTransactionType("debit");
        TransactionType chargeback = TransactionType
                .getTransactionType("chargeback");

        assertEquals("PAYMENT", payment.name());
        assertEquals("CREDIT", credit.name());
        assertEquals("DEBIT", debit.name());
        assertEquals("CHARGEBACK", chargeback.name());

    }

    @Test(expected = TransactionTypeNotFoundException.class)
    public void shouldReturnTransactionTypeNotFoundException() {
        TransactionType.getTransactionType("tipo transacao");
    }

}
