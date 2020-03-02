package br.com.transactions.dto;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SummarySaleResource {

  @JsonProperty("net_amount_sale")
  private BigDecimal netAmountSale;

  @JsonProperty("gross_amount_sale")
  private BigDecimal grossAmountSale;

  @JsonProperty("merchant_discount_rate")
  private Double merchantDiscountRate;

  @JsonProperty("number_summary_sale")
  private Long numberSummarySale;

  public SummarySaleResource(BigDecimal netAmountSale, BigDecimal grossAmountSale,
      Double merchantDiscountRate, Long numberSummarySale) {
    this.netAmountSale = netAmountSale;
    this.grossAmountSale = grossAmountSale;
    this.merchantDiscountRate = merchantDiscountRate;
    this.numberSummarySale = numberSummarySale;
  }

  public BigDecimal getNetAmountSale() {
    return netAmountSale;
  }

  public BigDecimal getGrossAmountSale() {
    return grossAmountSale;
  }

  public Double getMerchantDiscountRate() {
    return merchantDiscountRate;
  }

  public Long getNumberSummarySale() {
    return numberSummarySale;
  }

}
