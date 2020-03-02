package br.com.transactions.domain.repository;

import static org.mockito.Mockito.mock;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.transactions.domain.model.SummarySale;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class SummarySaleRepositoryTest {

    @Mock
    private SummarySaleRepository summarySaleRepository;

    @Mock
    private SummarySale summarySaleReturnByDatabase;

    @Test
    public void shouldTestSaveRepository() {
        SummarySale summarySale = mock(SummarySale.class);

        BDDMockito.given(summarySaleRepository.save(summarySale))
                .willReturn(summarySaleReturnByDatabase);

        summarySaleReturnByDatabase = summarySaleRepository.save(summarySale);

        BDDMockito.verify(summarySaleRepository).save(summarySale);
    }

    @Test
    public void shouldTestFindByNumberRepository() {
        Optional<SummarySale> summarySaleOptional = summarySaleRepository
                .findByNumberSummarySale(1L);

        BDDMockito.given(summarySaleRepository.findByNumberSummarySale(1L))
                .willReturn(summarySaleOptional);

        BDDMockito.verify(summarySaleRepository).findByNumberSummarySale(1L);
    }
}
