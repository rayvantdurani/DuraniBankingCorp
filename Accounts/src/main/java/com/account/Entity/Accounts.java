package com.account.Entity;


import lombok.Data;

@Data
public class Accounts {


    private Long customerId;
    private Long accountId;
    private String accountType;
    private Long accountBalance;

}
