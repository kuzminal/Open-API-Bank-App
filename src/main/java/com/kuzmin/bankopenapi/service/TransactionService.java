package com.kuzmin.bankopenapi.service;

import com.kuzmin.bankopenapi.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        return List.of(new Transaction("credit", 1234567, "USD", 100.00, "acme", "acme.png"));
    }
}
