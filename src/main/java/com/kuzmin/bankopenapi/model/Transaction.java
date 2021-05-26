package com.kuzmin.bankopenapi.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Transaction {
    String type;
    LocalDate date;
    String accountNumber;
    String currency;
    Double amount;
    String merchantName;
    String merchantLogo;
}
