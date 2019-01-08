package hellspawn287.recipeappspring5.repositories;

import hellspawn287.recipeappspring5.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);


}
