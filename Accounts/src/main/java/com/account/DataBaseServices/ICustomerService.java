package com.account.DataBaseServices;

import com.account.DTO.CustomerDTO;
import com.account.Entity.Customer;

public interface ICustomerService {

    void createCustomerAccount(CustomerDTO customerDTO);

    CustomerDTO fetchCustomerDetails(CustomerDTO customerDTO);

    void deleteCustomerRecord(Long customerId);
}
