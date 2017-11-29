package pl.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.engine.model.Inspection;

@Repository
public interface InspectionDao extends JpaRepository<Inspection, Long> {
}
