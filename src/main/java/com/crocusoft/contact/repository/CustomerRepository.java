package com.crocusoft.contact.repository;

import com.crocusoft.contact.domain.Customer;
import com.crocusoft.contact.dto.CustomerDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}