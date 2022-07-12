package cz.vavrecka.cookbook.repository

import cz.vavrecka.cookbook.domain.Ingredient
import org.springframework.data.repository.reactive.ReactiveSortingRepository

interface IngredientRepository : ReactiveSortingRepository<Ingredient, Long>