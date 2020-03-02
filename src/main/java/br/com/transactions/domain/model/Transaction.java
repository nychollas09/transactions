package br.com.transactions.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import br.com.transactions.domain.utils.CardHolder;
import br.com.transactions.domain.utils.TransactionType;

@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID uuid;

  private static final long serialVersionUID = 3680686304467164015L;

  @Column
  private String nsu;

  @Column(name = "transction_type")
  @Enumerated(EnumType.STRING)
  private TransactionType transactionType;

  @Column(name = "gross_amount")
  private BigDecimal grossAmount;

  @Column(name = "net_amount")
  private BigDecimal netAmount;

  @Column(name = "installment_number")
  private Short installmentNumber;

  @Column(name = "number_of_installments")
  private Short numberOfInstallments;

  @Column(name = "merchant_code")
  private String merchantCode;

  @Column(name = "card_holder")
  @Enumerated(EnumType.STRING)
  private CardHolder cardHolder;

  @Column(name = "masked_credit_card_number")
  private String maskedCreditCardNumber;

  @Column(name = "captured_at")
  @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
  private LocalDateTime capturedAt;

  @Column(name = "payment_date")
  @DateTimeFormat(pattern = "dd-MM-yyyy")
  private LocalDate paymentDate;

  @ManyToOne
  @JoinColumn(name = "summary_sale_uuid", referencedColumnName = "uuid",
      foreignKey = @ForeignKey(name = "fk_uuid_summary_sale"))
  private SummarySale summarySale;

  @SuppressWarnings("unused")
  private Transaction() {}

  public Transaction(String nsu, TransactionType transactionType, BigDecimal grossAmount,
      BigDecimal netAmount, Short installmentNumber, Short numberOfInstallments,
      String merchantCode, CardHolder cardHolder, String maskedCreditCardNumber,
      LocalDateTime capturedAt, LocalDate paymentDate, SummarySale summarySale) {
    this.nsu = nsu;
    this.transactionType = transactionType;
    this.grossAmount = grossAmount;
    this.netAmount = netAmount;
    this.installmentNumber = installmentNumber;
    this.numberOfInstallments = numberOfInstallments;
    this.merchantCode = merchantCode;
    this.cardHolder = cardHolder;
    this.maskedCreditCardNumber = maskedCreditCardNumber;
    this.capturedAt = capturedAt;
    this.paymentDate = paymentDate;
    this.summarySale = summarySale;
  }

  public UUID getUuid() {
    return uuid;
  }

  public String getNsu() {
    return nsu;
  }

  public void setNsu(String nsu) {
    this.nsu = nsu;
  }

  public TransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public BigDecimal getGrossAmount() {
    return grossAmount;
  }

  public void setGrossAmount(BigDecimal grossAmount) {
    this.grossAmount = grossAmount;
  }

  public BigDecimal getNetAmount() {
    return netAmount;
  }

  public void setNetAmount(BigDecimal netAmount) {
    this.netAmount = netAmount;
  }

  public Short getInstallmentNumber() {
    return installmentNumber;
  }

  public void setInstallmentNumber(Short installmentNumber) {
    this.installmentNumber = installmentNumber;
  }

  public Short getNumberOfInstallments() {
    return numberOfInstallments;
  }

  public void setNumberOfInstallments(Short numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
  }

  public String getMerchantCode() {
    return merchantCode;
  }

  public void setMerchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
  }

  public CardHolder getCardHolder() {
    return cardHolder;
  }

  public void setCardHolder(CardHolder cardHolder) {
    this.cardHolder = cardHolder;
  }

  public String getMaskedCreditCardNumber() {
    return maskedCreditCardNumber;
  }

  public void setMaskedCreditCardNumber(String maskedCreditCardNumber) {
    this.maskedCreditCardNumber = maskedCreditCardNumber;
  }

  public LocalDateTime getCapturedAt() {
    return capturedAt;
  }

  public void setCapturedAt(LocalDateTime capturedAt) {
    this.capturedAt = capturedAt;
  }

  public LocalDate getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }

  public SummarySale getSummarySale() {
    return summarySale;
  }

  public void setSummarySale(SummarySale summarySale) {
    this.summarySale = summarySale;
  }

}
