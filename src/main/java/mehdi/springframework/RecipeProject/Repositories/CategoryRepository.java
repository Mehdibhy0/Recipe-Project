package mehdi.springframework.RecipeProject.Repositories;

import mehdi.springframework.RecipeProject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
