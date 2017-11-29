package pl.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.engine.model.Inspection;
import pl.engine.model.Owner;
import pl.engine.model.Vehicle;

import java.util.List;

@Repository
public interface VehicleDao extends JpaRepository<Vehicle, Long> {
    @Query( "SELECT o FROM Owner o " +
            "JOIN o.vehicles v " +
            "WHERE v.vehicle.id = ?1")
    List<Owner> getOwnersByVehicleId(Long id);

    @Query( "SELECT i FROM Inspection i " +
            "JOIN i.vehicle v " +
            "WHERE v.id = ?1") //nie sprawdzalem jeszcze
    List<Inspection> getAllInspections(Long id);
}
