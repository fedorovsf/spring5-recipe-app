package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created by sergei on 26/12/2018.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
