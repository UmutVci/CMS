package com.backend.Adapters.mapper;

import com.backend.Adapters.dto.MovieDto;
import com.backend.Application.Services.Models.Movie;

public class MovieMapper {
    public static Movie mapToMovie(MovieDto movieDto){
        return new Movie(
                movieDto.getId(),
                movieDto.getMovieName(),
                movieDto.getDuration(),
                movieDto.getGenre(),
                movieDto.getPrice(),
                movieDto.getAgeRestriction()
        );
    }
    public static MovieDto mapToMovieDto(Movie movie){
        return new MovieDto(
                movie.getId(),
                movie.getMovieName(),
                movie.getDuration(),
                movie.getGenre(),
                movie.getPrice(),
                movie.getAgeRestriction()
        );
    }
}
