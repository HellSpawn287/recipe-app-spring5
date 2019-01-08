package hellspawn287.recipeappspring5.repositories;

import hellspawn287.recipeappspring5.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
