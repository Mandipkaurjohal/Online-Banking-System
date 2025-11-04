package com.banking.Online.Banking.System.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountDTO {
    private  Long id;
    private String name;
    private String accountNumber;
    private double balance;
    private  Long userId;
}
