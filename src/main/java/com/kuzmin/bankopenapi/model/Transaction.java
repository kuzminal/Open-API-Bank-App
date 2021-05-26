package com.kuzmin.bankopenapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    String type;
    Integer accountNumber;
    String currency;
    Double amount;
    String merchantName;
    String merchantLogo;
}
