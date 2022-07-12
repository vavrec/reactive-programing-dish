package cz.vavrecka.cookbook.config

import io.r2dbc.spi.ConnectionFactory
import org.springframework.boot.r2dbc.ConnectionFactoryBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator

@Configuration
@EnableR2dbcRepositories
class PostgresConfiguration : AbstractR2dbcConfiguration() {

    @Bean
    override fun connectionFactory(): ConnectionFactory {
        return ConnectionFactoryBuilder.withUrl("r2dbc:postgresql://localhost:6543/TEST_SM")
            .username("postgres")
            .password("admin")
            .build();
    }

    @Bean
    fun dbInit(connectionFactory: ConnectionFactory): ConnectionFactoryInitializer {
        val populator = ResourceDatabasePopulator(ClassPathResource("schema.sql"))
        return ConnectionFactoryInitializer().apply {
            setConnectionFactory(connectionFactory)
            setDatabasePopulator(populator)
        }

    }

}