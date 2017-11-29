package pl.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.engine.model.Owner;
import pl.engine.model.VehicleOwner;

import java.util.List;

@Repository
public interface OwnerDao extends JpaRepository<Owner, Long> {
    @Query("SELECT v FROM Vehicle v " +
            "JOIN v.owners o " +
            "WHERE o.owner.id = ?1")
    List<Owner> getVehiclesByOwnerId(Long id);
}
