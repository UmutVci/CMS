package com.backend.domain.repository;

import com.backend.domain.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovieRepository extends JpaRepository<MovieEntity, Long> {
}
