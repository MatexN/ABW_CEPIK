package pl.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.engine.entity.Inspection;

@Repository
public interface InspectionDao extends JpaRepository<Inspection, Long> {
}
