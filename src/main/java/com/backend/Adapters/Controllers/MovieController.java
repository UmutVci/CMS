package com.backend.Adapters.Controllers;

import com.backend.Adapters.dto.MovieDto;
import com.backend.Application.Services.Impl.MovieServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
@AllArgsConstructor
public class MovieController {
    private MovieServiceImpl movieService;
@PostMapping
@Operation(
        operationId = "createMovie",
        summary = "Create new Movie",
        description = "new Movie created!"
)
@ApiResponse(
        responseCode = "201",
        description = "Operation completed!"
)
public ResponseEntity<MovieDto> createMovie(@RequestBody MovieDto movieDto){
    MovieDto savedMovie = movieService.createMovie(movieDto);
    return new ResponseEntity<>(savedMovie,HttpStatus.CREATED);
}
    @GetMapping("{id}")
    @Operation(
            operationId = "getMovie",
            summary = "Get the Movie",
            description = "the Movie came!"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Operation completed!"
    )
public ResponseEntity<MovieDto> getMovie(@PathVariable("id") long id){
    MovieDto movieDto = movieService.getMovie(id);
    return ResponseEntity.ok(movieDto);
}
    @GetMapping()
    @Operation(
            operationId = "getAllMovies",
            summary = "Get all Movies",
            description = "all Movies came!"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Operation completed!"
    )
public ResponseEntity<List<MovieDto>> getAllMovie(){
    List<MovieDto> movieDtoList = movieService.getAllMovies();
    return ResponseEntity.ok(movieDtoList);
}
    @PutMapping("{id}")
    @Operation(
            operationId = "updateMovie",
            summary = "Update the Movie",
            description = "the Movie updated!"
    )
    @ApiResponse(
            responseCode = "201",
            description = "the Movie updated!"
    )
public ResponseEntity<MovieDto> updateMovie(@PathVariable("id") long id, MovieDto updatedMovieDto){
    MovieDto movieDto = movieService.updateMovie(id, updatedMovieDto);
    return ResponseEntity.ok(movieDto);
}

@DeleteMapping("{id}")
@Operation(
        operationId = "deleteMovie",
        summary = "Movie Customer",
        description = "the Movie deleted!"
)
@ApiResponse(
        responseCode = "200",
        description = "the Movie deleted!"
)
    public ResponseEntity<String> deleteMovie(@PathVariable("id") long id){
    movieService.deleteMovie(id);
    return ResponseEntity.ok("Movie successfully deleted!");
}
}
