package hellspawn287.recipeappspring5.controllers;

import hellspawn287.recipeappspring5.domain.Category;
import hellspawn287.recipeappspring5.domain.UnitOfMeasure;
import hellspawn287.recipeappspring5.repositories.CategoryRepository;
import hellspawn287.recipeappspring5.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        System.out.println("Some msg to say: ...");

        Optional<Category> categoryOptional = categoryRepository.findByDescription("Italian");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("Category Id is: " + categoryOptional.get().getId());
        System.out.println("Unit Of Measure Id is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
