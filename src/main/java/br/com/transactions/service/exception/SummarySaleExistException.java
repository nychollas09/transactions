package br.com.transactions.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class SummarySaleExistException extends Exception {

  private static final long serialVersionUID = -1441151015089327609L;

  public SummarySaleExistException(String message) {
    super(message);
  }

}
