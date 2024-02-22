package com.account.Repository;

import com.account.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Long, Customer> {
}
