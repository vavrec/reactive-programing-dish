package cz.vavrecka.cookbook.domain

import org.springframework.data.relational.core.mapping.Table

@Table("dish_ingredient")
data class Dish2Ingredient(val dishId: Long, val ingredientId: Long)