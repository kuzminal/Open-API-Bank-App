package com.kuzmin.bankopenapi.controller;

import com.kuzmin.bankopenapi.model.Transaction;
import com.kuzmin.bankopenapi.service.TransactionService;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping(value = "/{accountNumber}", produces = "application/json")
    public List<Transaction> getAllByAccountNumber(@PathVariable("accountNumber") final Integer accountNumber) {
        return transactionService.findAllByAccountNumber(accountNumber);
    }
}
