package springframework.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipe.model.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
