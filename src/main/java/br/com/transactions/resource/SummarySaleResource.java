package br.com.transactions.resource;

import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SummarySaleResource {

  @JsonProperty("net_amount_sale")
  @NotNull(message = "net_amount_sale is required!")
  private BigDecimal netAmountSale;

  @JsonProperty("gross_amount_sale")
  @NotNull(message = "gross_amount_sale is required!")
  private BigDecimal grossAmountSale;

  @JsonProperty("merchant_discount_rate")
  @NotNull(message = "merchant_discount_rate is required!")
  private Double merchantDiscountRate;

  @JsonProperty("number_summary_sale")
  @NotNull(message = "number_summary_sale is required!")
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
