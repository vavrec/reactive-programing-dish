package cz.vavrecka.cookbook.config

import cz.vavrecka.cookbook.repository.DishRepository
import cz.vavrecka.cookbook.service.DishServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ServiceConfiguration {

    @Bean
    fun dishService(dishRepo: DishRepository) = DishServiceImpl(dishRepo);


}