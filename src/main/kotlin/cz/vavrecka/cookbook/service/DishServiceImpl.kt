package cz.vavrecka.cookbook.service

import cz.vavrecka.cookbook.domain.Dish
import cz.vavrecka.cookbook.repository.DishRepository
import reactor.core.publisher.Flux

class DishServiceImpl(
    val dishRepo: DishRepository
) : DishService {

    override fun getAllDishes(): Flux<Dish> = dishRepo.findAll()

    override fun getIngredientsForDish(dishId: Long) = dishRepo.getDishIngredients(dishId)
}