package br.com.transactions.domain.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.transactions.domain.utils.exception.CardHolderNotFoundException;

@SpringBootTest
@ActiveProfiles("test")
public class CardHolderTest {

    @Test
    public void shouldReturnCardHolder() {
        CardHolder mastercard = CardHolder.getCardHolder("mastercard");
        CardHolder elo = CardHolder.getCardHolder("elo");
        CardHolder amex = CardHolder.getCardHolder("amex");
        CardHolder hipercard = CardHolder.getCardHolder("hipercard");

        assertEquals("MASTERCARD", mastercard.name());
        assertEquals("ELO", elo.name());
        assertEquals("AMEX", amex.name());
        assertEquals("HIPERCARD", hipercard.name());

    }

    @Test(expected = CardHolderNotFoundException.class)
    public void shouldReturnCardHolderNotFoundException() {
        CardHolder.getCardHolder("bandeira");
    }

}
