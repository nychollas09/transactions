package br.com.transactions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
  public ResponseEntity<Void> save(@RequestBody TransactionDataTransferObject requestDTO) {
    service.save(requestDTO);
    return ResponseEntity.ok().build();
  }

  @GetMapping("/scheduling")
  public ResponseEntity<String> scheduling() {
    return ResponseEntity.ok("OK");
  }

}
