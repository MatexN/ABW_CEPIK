package pl.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.engine.entity.VehicleOwner;

@Repository
public interface VehicleOwnerDao extends JpaRepository<VehicleOwner, Long> {

}
