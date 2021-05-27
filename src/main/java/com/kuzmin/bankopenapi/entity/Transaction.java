package com.kuzmin.bankopenapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
