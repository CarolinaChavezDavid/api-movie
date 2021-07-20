package com.android.apimovie.services

import com.android.apimovie.entities.Movie
import com.android.apimovie.repositories.MovieRepository
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(private val repository: MovieRepository): MovieService {
    override fun getMovieList(): List<Movie> {
        return repository.findAll()
    }
}