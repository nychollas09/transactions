package br.com.transactions.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import br.com.transactions.domain.model.SummarySale;
import br.com.transactions.domain.repository.SummarySaleRepository;
import br.com.transactions.dto.SummarySaleDataTransferObject;
import br.com.transactions.filter.SummarySaleSpecification;
import br.com.transactions.service.exception.SummarySaleNotFoundException;

@Service
public class SummarySaleServiceImpl implements SummarySaleService {

  private SummarySaleRepository repository;
  private SummarySaleSpecification specification;

  public SummarySaleServiceImpl(SummarySaleRepository repository,
      SummarySaleSpecification specification) {
    this.repository = repository;
    this.specification = specification;
  }

  @Override
  public List<SummarySaleDataTransferObject> findByNumberOfInstallments(
      String numberOfInstallments) {
    List<SummarySaleDataTransferObject> summarySaleDTOs = new ArrayList<>();

    repository.findAll(specification.byNumberOfInstallments(Long.parseLong(numberOfInstallments)))
        .stream().forEach(summary -> {
          SummarySaleDataTransferObject summarySaleDTO = new SummarySaleDataTransferObject(
              summary.getNetAmountSale(), summary.getGrossAmountSale(),
              summary.getMerchantDiscountRate(), summary.getNumberSummarySale());
          summarySaleDTOs.add(summarySaleDTO);
        });
    return summarySaleDTOs;
  }

  @Override
  public List<SummarySaleDataTransferObject> findAll() {
    List<SummarySaleDataTransferObject> summarySaleDTOs = new ArrayList<>();
    repository.findAll().stream().forEach(summary -> {
      SummarySaleDataTransferObject summarySaleDTO = new SummarySaleDataTransferObject(
          summary.getNetAmountSale(), summary.getGrossAmountSale(),
          summary.getMerchantDiscountRate(), summary.getNumberSummarySale());
      summarySaleDTOs.add(summarySaleDTO);
    });
    return summarySaleDTOs;
  }

  @Override
  public SummarySaleDataTransferObject findByNumber(String number)
      throws SummarySaleNotFoundException {

    SummarySale summarySale = repository.findByNumberSummarySale(Long.parseLong(number))
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
        repository.findByNumberSummarySale(summarySaleDTO.getNumberSummarySale());
    checkSummarySaleExist(summarySaleDTO, optionalSummary);

    SummarySale summarySale = repository.saveAndFlush(
        new SummarySale(summarySaleDTO.getNetAmountSale(), summarySaleDTO.getGrossAmountSale(),
            summarySaleDTO.getMerchantDiscountRate(), summarySaleDTO.getNumberSummarySale()));

    return new SummarySaleDataTransferObject(summarySale.getNetAmountSale(),
        summarySale.getGrossAmountSale(), summarySale.getMerchantDiscountRate(),
        summarySale.getNumberSummarySale());

  }

  private void checkSummarySaleExist(SummarySaleDataTransferObject summarySaleDTO,
      Optional<SummarySale> optionalSummary) {
    if (optionalSummary.isPresent()) {
      throw new IllegalArgumentException("This summary number[ "
          + summarySaleDTO.getNumberSummarySale() + " ]already exists in the database!");
    }
  }

}
