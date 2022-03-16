package mehdi.springframework.RecipeProject.Service;

import mehdi.springframework.RecipeProject.Repositories.RecipeRepository;
import mehdi.springframework.RecipeProject.domain.Recipe;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
