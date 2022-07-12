package cz.vavrecka.cookbook.domain

import org.springframework.data.annotation.Id

data class Ingredient(@Id val id: Long?, val name: String, val fat: Double, val carbohydrates: Double, val protein: Double)
