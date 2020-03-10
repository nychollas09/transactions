package br.com.transactions.domain.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class TransactionTypeNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 9034731086851462672L;

  public TransactionTypeNotFoundException(String message) {
    super(message);
  }

}
