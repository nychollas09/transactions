package br.com.transactions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.transactions.resource.SummarySaleResource;
import br.com.transactions.service.SummarySaleServiceImpl;

@RestController
@RequestMapping("api/summary-sale")
public class SummarySaleController {

  @Autowired
  private SummarySaleServiceImpl service;

  @GetMapping("find/{number}")
  public ResponseEntity<SummarySaleResource> findByNumber(
      @PathVariable(value = "number") String number) {
    return ResponseEntity.ok(service.findByNumberSummarySale(number));
  }

}
