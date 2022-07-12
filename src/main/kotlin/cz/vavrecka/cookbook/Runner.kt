package cz.vavrecka.cookbook

import cz.vavrecka.cookbook.domain.Dish
import cz.vavrecka.cookbook.domain.Dish2Ingredient
import cz.vavrecka.cookbook.domain.Ingredient
import cz.vavrecka.cookbook.repository.Dish2IngredientRepository
import cz.vavrecka.cookbook.repository.DishRepository
import cz.vavrecka.cookbook.repository.IngredientRepository
import cz.vavrecka.cookbook.service.DishService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.util.function.Tuple2

@Component
class Runner : CommandLineRunner {

    @Autowired
    lateinit var dishService: DishService

    override fun run(vararg args: String?) {


//        dishService.getAllDishes().subscribe { println(it) }


//        val dish = Dish(null, "Knedlo zelo vepro", "Proste to uvař ")
//        val ingredient = Ingredient(null, "mrkev", 1.2, 5.3, 5.0)


//        dishRepository.save(dish)
//            .zipWith(ingredientRepository.save(ingredient))
//            .flatMap { dish2IngredientRepository.save(Dish2Ingredient(dishId = it.t1.id!!, ingredientId = it.t2.id!!)) }
//            .subscribe {
//                println(it)
//            }
//
//        dishRepository.findByName("Knedlo zelo vepro")
//            .flatMap { dish2IngredientRepository.findByDishId(it.id!!) }
//            .flatMap { ingredientRepository.findById(it.ingredientId!!) }
//            .subscribe { println(it) }

        dishService.getIngredientsForDish(4).subscribe { println(it) }

    }
}