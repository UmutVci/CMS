package com.backend.Application.Services;

import com.backend.Adapters.dto.MovieDto;

import java.util.List;

public interface IMovieService {
    MovieDto createMovie(MovieDto movieDto);
    MovieDto getMovie(long id);
    List<MovieDto> getAllMovies();
    MovieDto updateMovie(long id, MovieDto updatedMovieDto);
    void deleteMovie(long id);


}
