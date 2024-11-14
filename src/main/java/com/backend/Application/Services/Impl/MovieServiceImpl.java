package com.backend.Application.Services.Impl;

import com.backend.Adapters.dto.MovieDto;
import com.backend.Adapters.mapper.MovieMapper;
import com.backend.Application.Services.IMovieService;
import com.backend.Application.Services.Models.Movie;
import com.backend.Domain.Repository.IMovieRepository;
import com.backend.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements IMovieService {
private  IMovieRepository iMovieRepository;

    public MovieServiceImpl(IMovieRepository iMovieRepository) {
        this.iMovieRepository = iMovieRepository;
    }

    @Override
    public MovieDto createMovie(MovieDto movieDto) {
        Movie movie = MovieMapper.mapToMovie(movieDto);
        Movie savedMovie = iMovieRepository.save(movie);
        return MovieMapper.mapToMovieDto(savedMovie);
    }

    @Override
    public MovieDto getMovie(long id) {
        Movie movie = iMovieRepository
                .findById(id)
                .orElseThrow(()->
                new ResourceNotFoundException("Could not find movie with that : " + id));
        return MovieMapper.mapToMovieDto(movie);
    }

    @Override
    public List<MovieDto> getAllMovies() {
        List<Movie> movies = iMovieRepository.findAll();
        return  movies.stream()
                .map(MovieMapper::mapToMovieDto)
                .collect(Collectors.toList());
    }

    @Override
    public MovieDto updateMovie(long id, MovieDto updatedMovieDto) {
        Movie movie = iMovieRepository
                .findById(id)
                .orElseThrow(()->
                new RuntimeException("Could not find movie with that : " + id));
        movie.setMovieName(updatedMovieDto.getMovieName());
        movie.setDuration(updatedMovieDto.getDuration());
        movie.setPrice(updatedMovieDto.getPrice());
        movie.setGenre(updatedMovieDto.getGenre());
        movie.setAgeRestriction(updatedMovieDto.getAgeRestriction());
        Movie updatedMovie = iMovieRepository.save(movie);
        return MovieMapper.mapToMovieDto(updatedMovie);
    }

    @Override
    public void deleteMovie(long id) {
        Movie movie = iMovieRepository
                .findById(id)
                .orElseThrow(()->
                        new ResourceNotFoundException("Could not find movie with that : " + id));
        iMovieRepository.delete(movie);
    }
}
