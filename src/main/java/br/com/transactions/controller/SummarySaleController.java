package br.com.transactions.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.transactions.dto.SummarySaleDataTransferObject;
import br.com.transactions.service.SummarySaleService;

@RestController
@RequestMapping("api/summary-sale")
public class SummarySaleController {

  @Autowired
  private SummarySaleService service;

  @GetMapping("find/{number}")
  public ResponseEntity<SummarySaleDataTransferObject> findByNumber(
      @PathVariable(value = "number", required = true) String number) {
    return ResponseEntity.ok(service.findByNumber(number));
  }

  @GetMapping("find")
  public ResponseEntity<List<SummarySaleDataTransferObject>> find() {
    return ResponseEntity.ok(service.findAll());
  }

  @GetMapping("find/{numberOfInstallments}")
  public ResponseEntity<List<SummarySaleDataTransferObject>> findByNumberOfInstallments(
      @PathVariable(value = "numberOfInstallments", required = true) String numberOfInstallments) {
    return ResponseEntity.ok(service.findByNumberOfInstallments(numberOfInstallments));
  }

}
