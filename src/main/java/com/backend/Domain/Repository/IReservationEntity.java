package com.backend.domain.repository;

import com.backend.domain.entities.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservationEntity extends JpaRepository<ReservationEntity, Long> {
}
