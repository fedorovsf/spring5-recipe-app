package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sergei on 30/11/2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
