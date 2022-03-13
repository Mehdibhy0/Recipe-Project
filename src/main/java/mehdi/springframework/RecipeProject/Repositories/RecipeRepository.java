package mehdi.springframework.RecipeProject.Repositories;

import mehdi.springframework.RecipeProject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
