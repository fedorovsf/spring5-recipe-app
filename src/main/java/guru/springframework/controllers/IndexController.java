package guru.springframework.controllers;

import guru.springframework.services.RecipesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sergei on 18/08/2018.
 */
@Controller
public class IndexController {

    private final RecipesService recipesService;

    public IndexController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipesService.getRecipes());
        return "index";
    }


}
