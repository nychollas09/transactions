package br.com.transactions.service;

import br.com.transactions.domain.model.SummarySale;
import br.com.transactions.dto.SummarySaleResource;

public interface SummarySaleService {
    SummarySaleResource findByNumberSummarySale(String number);

    SummarySale save(SummarySaleResource summarySaleDTO);

}
