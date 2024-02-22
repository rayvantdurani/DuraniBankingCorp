package com.account.DTO;

import com.account.Entity.Accounts;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.HashMap;

@Data
public class CustomerDTO {


    private String customerId;
    private String name;
    private HashMap<Long, Accounts> accountsInfo;
}
