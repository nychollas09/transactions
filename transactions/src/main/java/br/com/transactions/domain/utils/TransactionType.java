package br.com.transactions.domain.utils;

import java.util.Arrays;

import br.com.transactions.domain.utils.exception.TransactionTypeNotFoundException;

public enum TransactionType {
    PAYMENT, CREDIT, DEBIT, CHARGEBACK;

    public static TransactionType getTransactionType(String transactionType) {
        return Arrays.asList(TransactionType.values()).stream().filter(
                type -> type.name().equals(transactionType.toUpperCase()))
                .findFirst()
                .orElseThrow(() -> new TransactionTypeNotFoundException(
                        "transaction type informed [ " + transactionType
                                + " ] not found!"));
    }
}
