package br.com.transactions.domain.utils.exception;

public class TransactionTypeNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 9034731086851462672L;

  public TransactionTypeNotFoundException(String message) {
    super(message);
  }

}
