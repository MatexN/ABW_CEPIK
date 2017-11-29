package pl.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.engine.model.Owner;
import pl.engine.model.Vehicle;

import java.util.List;

@Repository
public interface VehicleDao extends JpaRepository<Vehicle, Long> {
    @Query("SELECT o FROM Owner o " +
            "JOIN o.vehicles v " +
            "WHERE v.vehicle.id = ?1")
    List<Owner> getOwnersByVehicleId(Long id);
}
