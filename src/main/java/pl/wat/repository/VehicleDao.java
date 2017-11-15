package pl.wat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wat.model.Vehicle;

@Repository
public interface VehicleDao extends CrudRepository<Vehicle, Long> {
}
