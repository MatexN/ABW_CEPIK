package pl.wat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wat.model.DiagnosticStation;

@Repository
public interface DiagnosticStationDao extends CrudRepository<DiagnosticStation, Long> {
}
