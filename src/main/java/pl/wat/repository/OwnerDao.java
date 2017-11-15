package pl.wat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wat.model.Owner;

@Repository
public interface OwnerDao extends CrudRepository<Owner, Long> {
}
