package br.com.transactions.domain.utils;

import java.util.Arrays;

import br.com.transactions.domain.utils.exception.CardHolderNotFoundException;

public enum CardHolder {
    MASTERCARD, ELO, AMEX, HIPERCARD;

    public static CardHolder getCardHolder(String cardHolder) {
        return Arrays.asList(CardHolder.values()).stream().filter(
                holder -> holder.name().equals(cardHolder.toUpperCase()))
                .findAny()
                .orElseThrow(() -> new CardHolderNotFoundException(
                        "Card holder informed [ " + cardHolder
                                + " ] not found!"));
    }
}
