package cz.vavrecka.cookbook.service

import cz.vavrecka.cookbook.domain.Dish
import cz.vavrecka.cookbook.domain.Ingredient
import reactor.core.publisher.Flux

interface DishService {

    fun getAllDishes(): Flux<Dish>

    fun getIngredientsForDish(dishId: Long): Flux<Ingredient>

}