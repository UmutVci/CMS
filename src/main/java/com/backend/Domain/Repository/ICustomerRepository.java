package com.backend.domain.repository;

import com.backend.Application.Services.models.Customer;
import com.backend.domain.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
