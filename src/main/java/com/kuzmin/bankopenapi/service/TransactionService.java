package com.kuzmin.bankopenapi.service;

import com.kuzmin.bankopenapi.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TransactionService {
    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        return Arrays.asList(new Transaction());
    }
}
