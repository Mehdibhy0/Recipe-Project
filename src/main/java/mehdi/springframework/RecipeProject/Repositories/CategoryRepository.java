package mehdi.springframework.RecipeProject.Repositories;

import mehdi.springframework.RecipeProject.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    Optional<Category> findByDescription(String description);
}
