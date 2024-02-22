package com.account.Entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.HashMap;


@Data
public class Customer extends AuditingBaseEntity{


    @MongoId
    private String customerId;
    private String name;
    private HashMap<Long,Accounts> accountsInfo;

}
