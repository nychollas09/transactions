package br.com.transactions.domain.utils;

import java.util.Arrays;

import br.com.transactions.domain.utils.exception.BankNotFoundException;

public enum AgencyBanking {
    NUBANK, SOROCRED;

    public static AgencyBanking getAgencyBanking(String agencyBank)
            throws BankNotFoundException {
        return Arrays.asList(AgencyBanking.values()).stream().filter(
                banking -> banking.name().equals(agencyBank.toUpperCase()))
                .findFirst().orElseThrow(() -> new BankNotFoundException(
                        "Bank branch not found!"));
    }

}
