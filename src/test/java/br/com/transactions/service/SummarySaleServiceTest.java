package br.com.transactions.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import br.com.transactions.domain.model.SummarySale;
import br.com.transactions.domain.repository.SummarySaleRepository;
import br.com.transactions.filter.SummarySaleSpecification;

@RunWith(MockitoJUnitRunner.class)
public class SummarySaleServiceTest {

  @Mock
  private SummarySaleRepository repository;

  @Mock
  private SummarySaleSpecification specification;

  private SummarySaleServiceImpl service;
  private List<SummarySale> summarys;

  @Before
  public void berfore() {
    this.service = new SummarySaleServiceImpl(repository, specification);

    SummarySale summarySaleOne = new SummarySale(BigDecimal.valueOf(98.00).setScale(2),
        BigDecimal.valueOf(100.00).setScale(2), Double.parseDouble("0.02"),
        Long.parseLong("7364984"), 10);
    SummarySale summarySaleTwo =
        new SummarySale(BigDecimal.valueOf(8.00).setScale(2), BigDecimal.valueOf(10.00).setScale(2),
            Double.parseDouble("0.02"), Long.parseLong("7364985"), 10);

    summarys = new ArrayList<>();
    summarys.add(summarySaleOne);
    summarys.add(summarySaleTwo);

  }

  @Test
  public void shouldFindByNumberOfInstallments() {
    BDDMockito.given(specification.byNumberOfInstallments(Long.parseLong("10")))
        .willReturn(Mockito.any());

    service.findByNumberOfInstallments("10");

    BDDMockito.verify(specification).byNumberOfInstallments(Long.parseLong("10"));
  }

  @Test
  public void shouldFindAll() {
    BDDMockito.given(repository.findAll()).willReturn(summarys);

    service.findAll();

    BDDMockito.verify(repository).findAll();
  }

}
