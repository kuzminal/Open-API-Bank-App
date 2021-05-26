package com.kuzmin.bankopenapi.controller;

import com.kuzmin.bankopenapi.model.Transaction;
import com.kuzmin.bankopenapi.service.TransactionService;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping(value = "/transactions", produces = "application/json")
    public List<Transaction> getAllByAccountNumber(@RequestParam String accountNumber) {
        return transactionService.findAllByAccountNumber(accountNumber);
    }
}
