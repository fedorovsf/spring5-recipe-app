package guru.springframework.services;

import guru.springframework.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by sergei on 04/12/2018.
 */
@Service
public interface RecipesService {
     Set<Recipe> getRecipes();
}
