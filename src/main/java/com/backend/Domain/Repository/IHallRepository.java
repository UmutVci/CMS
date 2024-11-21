package com.backend.domain.repository;

import com.backend.domain.entities.HallEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHallRepository extends JpaRepository<HallEntity, Long> {
}
