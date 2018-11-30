package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sergei on 30/11/2018.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{
}
