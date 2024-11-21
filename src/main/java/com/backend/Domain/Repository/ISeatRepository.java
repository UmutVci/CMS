package com.backend.domain.repository;

import com.backend.domain.entities.SeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISeatRepository extends JpaRepository<SeatEntity, Long> {
}
