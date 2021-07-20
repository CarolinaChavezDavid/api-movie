package com.android.apimovie.api

import com.android.apimovie.entities.Movie
import com.android.apimovie.services.MovieService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/movie")
class MovieAPI(private var movieService: MovieService ) {
    @GetMapping("/")
    fun getMovie(): List<Movie>{
        return movieService.getMovieList()
    }
}