package br.com.transactions.domain.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.transactions.domain.utils.exception.BankNotFoundException;

@SpringBootTest
@ActiveProfiles("test")
public class AgencyBankingTest {

    @Test
    public void shouldReturnAgencyBanking() {
        AgencyBanking nubank = AgencyBanking.getAgencyBanking("nubank");
        AgencyBanking sorocred = AgencyBanking.getAgencyBanking("sorocred");

        assertEquals(nubank.name(), "NUBANK");
        assertEquals(sorocred.name(), "SOROCRED");
    }

    @Test(expected = BankNotFoundException.class)
    public void shouldReturnBankNotFoundException() {
        AgencyBanking.getAgencyBanking("banco do brasil");
    }

}
