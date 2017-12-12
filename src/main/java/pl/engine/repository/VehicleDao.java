package pl.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.engine.entity.Vehicle;


@Repository
public interface VehicleDao extends JpaRepository<Vehicle, Long> {
}
