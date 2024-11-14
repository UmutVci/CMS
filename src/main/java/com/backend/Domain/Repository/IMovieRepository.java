package com.backend.Domain.Repository;

import com.backend.Application.Services.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovieRepository extends JpaRepository<Movie,Long> {
}
