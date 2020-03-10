package br.com.transactions.domain.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class BankNotFoundException extends RuntimeException {

  private static final long serialVersionUID = -8462184924018370302L;

  public BankNotFoundException(String message) {
    super(message);
  }

}
