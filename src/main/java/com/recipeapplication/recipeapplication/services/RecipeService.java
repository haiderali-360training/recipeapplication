package com.recipeapplication.recipeapplication.services;

import com.recipeapplication.recipeapplication.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
