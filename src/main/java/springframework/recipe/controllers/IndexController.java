package springframework.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.recipe.model.Category;
import springframework.recipe.model.UnitOfMeasure;
import springframework.recipe.repositories.CategoryRepository;
import springframework.recipe.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional=categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional=unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is: "+categoryOptional.get().getId());
        System.out.println("UOM ID is: "+unitOfMeasureOptional.get().getId());
        return "index";
    }


}
