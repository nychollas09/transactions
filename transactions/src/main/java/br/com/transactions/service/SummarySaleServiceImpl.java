package br.com.transactions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.transactions.domain.model.SummarySale;
import br.com.transactions.domain.repository.SummarySaleRepository;
import br.com.transactions.dto.SummarySaleResource;
import br.com.transactions.service.exception.SummarySaleNotFoundException;

@Component
public class SummarySaleServiceImpl implements SummarySaleService {

  @Autowired
  private SummarySaleRepository summarySaleRepository;

  @Override
  public SummarySaleResource findByNumberSummarySale(String number)
      throws SummarySaleNotFoundException {

    SummarySale summarySale = summarySaleRepository.findByNumberSummarySale(Long.parseLong(number))
        .orElseThrow(() -> new SummarySaleNotFoundException(
            "Summary Sale not found through the number summary sale informed, number [" + number
                + "]"));

    return new SummarySaleResource(summarySale.getNetAmountSale(), summarySale.getGrossAmountSale(),
        summarySale.getMerchantDiscountRate(), summarySale.getNumberSummarySale());
  }

  @Override
  public SummarySale save(SummarySaleResource summarySaleDTO) {
    return summarySaleRepository.saveAndFlush(
        new SummarySale(summarySaleDTO.getNetAmountSale(), summarySaleDTO.getGrossAmountSale(),
            summarySaleDTO.getMerchantDiscountRate(), summarySaleDTO.getNumberSummarySale()));
  }
}
