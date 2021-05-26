package com.kuzmin.bankopenapi.service;

import com.kuzmin.bankopenapi.service.TransactionService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TransactionServiceTest {
    @Autowired
    private TransactionService transactionService;

    @Test
    @DisplayName("Test List Elements")
    public void ifListElementsGreaterThanZero() {
        assertTrue(transactionService.findAllByAccountNumber("1234").size() > 0);
    }
}
