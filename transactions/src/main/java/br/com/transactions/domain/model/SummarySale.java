package br.com.transactions.domain.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "summary_sale", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "number_summary_sale" }) })

public class SummarySale extends BaseEntity {

    private static final long serialVersionUID = 6436502176902428943L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    @Column(name = "net_amount_sale")
    private BigDecimal netAmountSale;

    @Column(name = "gross_amount_sale")
    private BigDecimal grossAmountSale;

    @Column(name = "number_of_installments")
    private Integer numberOfInstallments;

    @Column(name = "merchant_discount_rate")
    private Double merchantDiscountRate;

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "number_summary_sale")
    private Long numberSummarySale;

    @OneToMany(mappedBy = "summarySale", fetch = FetchType.EAGER, orphanRemoval = false)
    private List<Transaction> transactions;

    @SuppressWarnings("unused")
    private SummarySale() {
    }

    public SummarySale(BigDecimal netAmountSale, BigDecimal grossAmountSale,
            Integer numberOfInstallments, Double merchantDiscountRate,
            Long numberSummarySale) {
        this.netAmountSale = netAmountSale;
        this.grossAmountSale = grossAmountSale;
        this.numberOfInstallments = numberOfInstallments;
        this.merchantDiscountRate = merchantDiscountRate;
        this.numberSummarySale = numberSummarySale;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Long getNumberSummarySale() {
        return numberSummarySale;
    }

    public BigDecimal getNetAmountSale() {
        return netAmountSale;
    }

    public void setNetAmountSale(BigDecimal netAmountSale) {
        this.netAmountSale = netAmountSale;
    }

    public BigDecimal getGrossAmountSale() {
        return grossAmountSale;
    }

    public void setGrossAmountSale(BigDecimal grossAmountSale) {
        this.grossAmountSale = grossAmountSale;
    }

    public Integer getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(Integer numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    public Double getMerchantDiscountRate() {
        return merchantDiscountRate;
    }

    public void setMerchantDiscountRate(Double merchantDiscountRate) {
        this.merchantDiscountRate = merchantDiscountRate;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}
