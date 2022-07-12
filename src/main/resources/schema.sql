CREATE TABLE IF NOT EXISTS dish(
    id          serial PRIMARY KEY,
    name        varchar(255) NOT NULL,
	workflow    varchar NOT NULL
);

CREATE TABLE IF NOT EXISTS ingredient(
	 id          serial PRIMARY KEY,
	 name 		 varchar NOT NULL,
	 fat 		 decimal NOT NULL,
	 carbohydrates decimal NOT NULL,
	 protein decimal NOT NULL
);

CREATE TABLE IF NOT EXISTS dish_ingredient(
	dish_id INT,
	ingredient_id INT,
	PRIMARY KEY (dish_id,ingredient_id),
	CONSTRAINT fk_dish FOREIGN KEY(dish_id) REFERENCES dish(id),
    CONSTRAINT fk_ingredient FOREIGN KEY(ingredient_id) REFERENCES ingredient(id)
)