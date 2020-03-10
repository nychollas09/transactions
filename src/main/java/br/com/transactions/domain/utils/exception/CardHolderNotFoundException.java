package br.com.transactions.domain.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CardHolderNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 1421424971858326175L;

  public CardHolderNotFoundException(String message) {
    super(message);
  }

}
