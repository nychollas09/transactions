package br.com.transactions.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.transactions.dto.TransactionDataTransferObject;
import br.com.transactions.service.TransactionService;

@RestController
@RequestMapping(path = "api/transaction/")
public class TransactionController {

  @Autowired
  private TransactionService service;

  @PostMapping("save")
  public ResponseEntity<Void> save(
      @Validated @RequestBody TransactionDataTransferObject requestDTO) {
    System.out.println("chegou");
    service.save(requestDTO);
    return ResponseEntity.ok().build();
  }

  @GetMapping("find")
  public ResponseEntity<List<TransactionDataTransferObject>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @GetMapping("/scheduling")
  public ResponseEntity<String> scheduling() {
    return ResponseEntity.ok("OK");
  }

}
