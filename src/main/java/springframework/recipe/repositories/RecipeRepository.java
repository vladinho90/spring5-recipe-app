package springframework.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipe.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
