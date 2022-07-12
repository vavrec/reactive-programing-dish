package cz.vavrecka.cookbook.repository

import cz.vavrecka.cookbook.domain.Dish
import cz.vavrecka.cookbook.domain.Ingredient
import org.springframework.data.r2dbc.repository.Query

import org.springframework.data.repository.reactive.ReactiveSortingRepository
import reactor.core.publisher.Flux

interface DishRepository : ReactiveSortingRepository<Dish, Long> {

    @Query("SELECT * FROM dish where name = :name")
    fun findByName(name: String): Flux<Dish>

    @Query(
        "SELECT i.id, i.name, i.fat, i.carbohydrates, i.protein FROM dish AS d inner join dish_ingredient AS di ON d.id = di.dish_id inner join ingredient AS i ON i.id = di.ingredient_id " +
                "WHERE d.id = :dishId"
    )
    fun getDishIngredients(dishId: Long): Flux<Ingredient>

}