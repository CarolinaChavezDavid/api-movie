package com.android.apimovie.entities

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="movies")
class Movie(@Id var id: Long, var title: String, var poster: String, var rating: Double) {

}