package com.android.apimovie.services

import com.android.apimovie.entities.Movie

interface MovieService {
    fun getMovieList():List<Movie>
}