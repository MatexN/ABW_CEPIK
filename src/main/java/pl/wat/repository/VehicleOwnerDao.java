package pl.wat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wat.model.VehicleOwner;

@Repository
public interface VehicleOwnerDao extends CrudRepository<VehicleOwner, Long> {
}
