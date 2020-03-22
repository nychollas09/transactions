package br.com.transactions.service;

import java.util.Optional;
import org.springframework.stereotype.Service;
import br.com.transactions.domain.model.SummarySale;
import br.com.transactions.domain.repository.SummarySaleRepository;
import br.com.transactions.dto.SummarySaleDataTransferObject;
import br.com.transactions.service.exception.SummarySaleNotFoundException;

@Service
public class SummarySaleServiceImpl implements SummarySaleService {

  private SummarySaleRepository summarySaleRepository;

  public SummarySaleServiceImpl(SummarySaleRepository summarySaleRepository) {
    this.summarySaleRepository = summarySaleRepository;
  }

  @Override
  public SummarySaleDataTransferObject findByNumberSummarySale(String number)
      throws SummarySaleNotFoundException {

    SummarySale summarySale = summarySaleRepository.findByNumberSummarySale(Long.parseLong(number))
        .orElseThrow(() -> new SummarySaleNotFoundException(
            "Summary Sale not found through the number summary sale informed, number [" + number
                + "]"));

    return new SummarySaleDataTransferObject(summarySale.getNetAmountSale(),
        summarySale.getGrossAmountSale(), summarySale.getMerchantDiscountRate(),
        summarySale.getNumberSummarySale());
  }

  @Override
  public SummarySaleDataTransferObject save(SummarySaleDataTransferObject summarySaleDTO) {
    Optional<SummarySale> optionalSummary =
        summarySaleRepository.findByNumberSummarySale(summarySaleDTO.getNumberSummarySale());
    if (optionalSummary.isPresent()) {
      throw new IllegalArgumentException("This summary number[ "
          + summarySaleDTO.getNumberSummarySale() + " ]already exists in the database!");
    } else {
      SummarySale summarySale = summarySaleRepository.saveAndFlush(
          new SummarySale(summarySaleDTO.getNetAmountSale(), summarySaleDTO.getGrossAmountSale(),
              summarySaleDTO.getMerchantDiscountRate(), summarySaleDTO.getNumberSummarySale()));

      return new SummarySaleDataTransferObject(summarySale.getNetAmountSale(),
          summarySale.getGrossAmountSale(), summarySale.getMerchantDiscountRate(),
          summarySale.getNumberSummarySale());

    }
  }

}
