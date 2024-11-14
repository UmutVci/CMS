package com.backend.Application.Services.Impl;

import com.backend.Adapters.dto.MovieDto;
import com.backend.Application.Services.IMovieService;

import java.util.List;

public class MovieServiceImpl implements IMovieService {

    @Override
    public MovieDto createMovie(MovieDto movieDto) {
        return null;
    }

    @Override
    public MovieDto getMovie(long id) {
        return null;
    }

    @Override
    public List<MovieDto> getAllMovies() {
        return List.of();
    }

    @Override
    public MovieDto updateMovie(long id, MovieDto updatedMovieDto) {
        return null;
    }

    @Override
    public void deleteMovie(long id) {

    }
}
