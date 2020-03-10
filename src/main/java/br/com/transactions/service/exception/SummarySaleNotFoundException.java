package br.com.transactions.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class SummarySaleNotFoundException extends RuntimeException {

  private static final long serialVersionUID = -1734239149421579270L;

  public SummarySaleNotFoundException(String message) {
    super(message);
  }

}
