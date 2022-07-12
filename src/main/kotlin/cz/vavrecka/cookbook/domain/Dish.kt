package cz.vavrecka.cookbook.domain

import org.springframework.data.annotation.Id

data class Dish(@Id val id: Long?, val name: String, val workflow: String)
