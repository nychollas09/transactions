package br.com.transactions.domain.utils.exception;

public class CardHolderNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 1421424971858326175L;

  public CardHolderNotFoundException(String message) {
    super(message);
  }

}
