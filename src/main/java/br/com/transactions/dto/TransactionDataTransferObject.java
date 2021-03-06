package br.com.transactions.dto;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionDataTransferObject {

  @JsonProperty("merchant_code")
  @NotNull(message = "merchant_code is required!")
  private String merchantCode;

  @JsonProperty("type_transaction")
  @NotNull(message = "type_transaction is required!")
  private String typeTransaction;

  @JsonProperty("count_installments")
  @NotNull(message = "count_installments is required!")
  private String countInstallments;

  @JsonProperty("masked_credit_card_number")
  @NotNull(message = "masked_credit_card_number is required!")
  private String maskedCreditCardNumber;

  @JsonProperty("captured_at")
  @NotNull(message = "captured_at is required!")
  private String capturedAt;

  @JsonProperty("payment_date")
  @NotNull(message = "payment_date is required!")
  private String paymentDate;

  @JsonProperty("summary_sale")
  @NotNull(message = "summary_sale is required!")
  private SummarySaleDataTransferObject summarySale;

  @JsonProperty("holder_name")
  @NotNull(message = "holder_name is required!")
  private String holder;

  public TransactionDataTransferObject(
      @NotNull(message = "merchant_code is required!") String merchantCode,
      @NotNull(message = "type_transaction is required!") String typeTransaction,
      @NotNull(message = "count_installments is required!") String countInstallments,
      @NotNull(message = "masked_credit_card_number is required!") String maskedCreditCardNumber,
      @NotNull(message = "captured_at is required!") String capturedAt,
      @NotNull(message = "payment_date is required!") String paymentDate) {
    this.merchantCode = merchantCode;
    this.typeTransaction = typeTransaction;
    this.countInstallments = countInstallments;
    this.maskedCreditCardNumber = maskedCreditCardNumber;
    this.capturedAt = capturedAt;
    this.paymentDate = paymentDate;
  }

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

  public SummarySaleDataTransferObject getSummarySale() {
    return summarySale;
  }

  public void setSummarySale(SummarySaleDataTransferObject summarySale) {
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
