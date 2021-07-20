package com.android.apimovie.repositories

import com.android.apimovie.entities.Movie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface MovieRepository: JpaRepository<Movie, Long> {
}