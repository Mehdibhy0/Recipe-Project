package mehdi.springframework.RecipeProject.Controllers;


import mehdi.springframework.RecipeProject.Service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/index","",""})
    public String getIndexPage(Model model)
    {
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";}
}
