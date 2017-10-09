package com.recipeapplication.recipeapplication.repositories;

import com.recipeapplication.recipeapplication.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
