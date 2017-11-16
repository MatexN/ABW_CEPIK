package pl.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.engine.model.DiagnosticStation;


@Repository
public interface DiagnosticStationDao extends JpaRepository<DiagnosticStation, Long> {
}
