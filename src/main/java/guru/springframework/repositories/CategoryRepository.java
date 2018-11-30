package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sergei on 30/11/2018.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
