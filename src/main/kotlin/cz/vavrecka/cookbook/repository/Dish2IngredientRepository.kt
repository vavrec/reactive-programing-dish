package cz.vavrecka.cookbook.repository

import cz.vavrecka.cookbook.domain.Dish2Ingredient
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveSortingRepository
import reactor.core.publisher.Flux

interface Dish2IngredientRepository : ReactiveSortingRepository<Dish2Ingredient, Long> {

    @Query("SELECT * FROM dish_ingredient where dish_id = :id")
    fun findByDishId(id: Long): Flux<Dish2Ingredient>
}
