package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by sergei on 30/11/2018.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{

    Optional<UnitOfMeasure> findByDescription(String description);
}
