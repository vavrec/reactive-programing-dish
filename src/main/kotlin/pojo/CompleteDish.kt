package pojo

import cz.vavrecka.cookbook.domain.Dish
import cz.vavrecka.cookbook.domain.Ingredient

data class CompleteDish(val dish: Dish, val ingredients: List<Ingredient>)
