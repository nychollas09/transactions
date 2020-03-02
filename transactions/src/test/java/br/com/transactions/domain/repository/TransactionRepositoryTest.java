package br.com.transactions.domain.repository;

import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.transactions.domain.model.Transaction;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class TransactionRepositoryTest {

    @Mock
    private TransactionRepository transactionRepository;

    @Test
    public void shouldTestSaveRepository() {
        Transaction transaction = mock(Transaction.class);

        BDDMockito.given(transactionRepository.save(transaction))
                .willReturn(transaction);

        transactionRepository.save(transaction);

        BDDMockito.verify(transactionRepository).save(transaction);

    }

}
