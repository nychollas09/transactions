package br.com.transactions.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionDataTransferObject {

  @JsonProperty("merchant_code")
  private String merchantCode;

  @JsonProperty("type_transaction")
  private String typeTransaction;

  @JsonProperty("count_installments")
  private String countInstallments;

  @JsonProperty("masked_credit_card_number")
  private String maskedCreditCardNumber;

  @JsonProperty("captured_at")
  private String capturedAt;

  @JsonProperty("payment_date")
  private String paymentDate;

  @JsonProperty("summary_sale")
  private SummarySaleResource summarySale;

  @JsonProperty("holder_name")
  private String holder;

  public String getMerchantCode() {
    return merchantCode;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public void setMerchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
  }

  public String getTypeTransaction() {
    return typeTransaction;
  }

  public void setTypeTransaction(String typeTransaction) {
    this.typeTransaction = typeTransaction;
  }

  public String getCountInstallments() {
    return countInstallments;
  }

  public void setCountInstallments(String countInstallments) {
    this.countInstallments = countInstallments;
  }

  public String getMaskedCreditCardNumber() {
    return maskedCreditCardNumber;
  }

  public void setMaskedCreditCardNumber(String maskedCreditCardNumber) {
    this.maskedCreditCardNumber = maskedCreditCardNumber;
  }

  public String getCapturedAt() {
    return capturedAt;
  }

  public void setCapturedAt(String capturedAt) {
    this.capturedAt = capturedAt;
  }

  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public SummarySaleResource getSummarySale() {
    return summarySale;
  }

  public void setSummarySale(SummarySaleResource summarySale) {
    this.summarySale = summarySale;
  }

  @Override
  public String toString() {
    return "TransactionRequest [merchantCode=" + merchantCode + ", typeTransaction="
        + typeTransaction + ", countInstallments=" + countInstallments + ", maskedCreditCardNumber="
        + maskedCreditCardNumber + ", capturedAt=" + capturedAt + ", paymentDate=" + paymentDate
        + ", summarySale=" + summarySale + "]";
  }

}
