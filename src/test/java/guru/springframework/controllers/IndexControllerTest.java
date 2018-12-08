package guru.springframework.controllers;

import guru.springframework.services.RecipesService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by sergei on 07/12/2018.
 */
public class IndexControllerTest {

    IndexController indexController;

    @Mock
    RecipesService recipesService;

    @Mock
    Model model;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipesService);

    }

    @Test
    public void getIndexPage() throws Exception {

        String viewName = indexController.getIndexPage(model);
        assertEquals("index", viewName);
        verify(recipesService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), anySet());

    }

}