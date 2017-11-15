package pl.wat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wat.model.Inspection;

@Repository
public interface InspectionDao extends CrudRepository<Inspection, Long> {
}
