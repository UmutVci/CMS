package com.backend.domain.repository;

import com.backend.domain.entities.SubscriptedCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubscriptionCustomerRepository extends JpaRepository<SubscriptedCustomer, Long> {
}
